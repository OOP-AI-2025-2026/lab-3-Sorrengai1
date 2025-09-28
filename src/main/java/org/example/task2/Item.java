package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(final long id, final String name, final double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public long getId() {
        return this.id;
    }
    public long getName() {
        return this.name;
    }
    public long getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + this.id
                + ", price=" + this.price
                + ", name='" + this.name + '\''
                + '}' + "\n";
    }
}
