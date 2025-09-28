package org.example.task2;

public final class IntStack {
    /**
     * Масив для стеку.
     */
    private int[] items;
    /**
     * Індекс вершини стеку.
     */
    private int top;
    /**
     * Початковий розмір стеку.
     */
    private static final int INITIAL_SIZE = 32;
    /** Конструктор створює порожній стек.*/
    public IntStack() {
        items = new int[INITIAL_SIZE];
        top = -1;
    }
    /**
     * @param value ціле число, яке додається у стек
     */
    public void push(final int value) {
        if (top == items.length - 1) {
            return;
        }
        items[++top] = value;
    }
    /**
     * @return елемент з вершини стеку або 0(якщо стек порожній)
     */
    public int pop() {
        return isEmpty() ? 0 : items[top--];
    }
    /**
     * @return елемент з вершини стеку або 0(якщо стек порожній)
     */
    public int peek() {
        return isEmpty() ? 0 : items[top];
    }
    /**
     * @return true, якщо стек порожній, false інакше
     */
    public boolean isEmpty() {
        return top == -1;
    }
    /**
     * @return кількість елементів у стеку
     */
    public int size() {
        return top + 1;
    }
    /**Очищує стек, видаляючи всі елементи.*/
    public void clear() {
        top = -1;
    }
}
