package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(final Item[] contents) {
        this.contents = contents;
    }
    public Item[] getContents() {
        return this.contents;
    }
    public int getIndex() {
        return this.index;
    }
    public void setIndex(final int i) {
        this.index = i;
    }

    public void removeById(final int itemIndex) {

        if (index == 0) {
            return;
        }
        int foundItemIndex = findItemInArray(this.contents[itemIndex]);

        if (foundItemIndex == -1) {
            return;
        }
        if (foundItemIndex == this.index - 1) {
            this.contents[this.index - 1] = null;
            this.index--;
            return;
        }

        shiftArray(foundItemIndex);
    }

    public void shiftArray(final int itemIndex) {
        for (int i = itemIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
        this.index--;
    }

    public int findItemInArray(final Item item) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == item.getId()) {
                return i;
            }
        }

        return -1;
    }

    void add(final Item item) {
        if (isCartFull()) {
            return;
        }
        this.contents[this.index] = item;
        this.index++;
    }

    public boolean isCartFull() {
        return this.index == this.contents.length;
    }

    @Override
    public String toString() {
        return "Cart{"
                + "contents=" + Arrays.toString(this.contents)
                + '}' + "\n";
    }
}
