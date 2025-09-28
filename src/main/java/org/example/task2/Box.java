package org.example.task2;

public final class Box {
    /** Висота коробки.*/
    private double height;
    /** Ширина коробки.*/
    private double width;
    /** Довжина коробки.*/
    private double length;
    /**
     * Конструктор коробки.
     * @param height Висота коробки.
     * @param width Ширина коробки.
     * @param length Довжина коробки.
     */
    public Box(final double height, final double width, final double length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }
    private void setHeight(final double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Вистота не повинна "
                    + "бути нулем або від'ємним числом.");
        }
        this.height = height;
    }
    private void setWidth(final double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина не повинна "
                    + "бути нулем або від'ємним числом.");
        }
        this.width = width;
    }
    private void setLength(final double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Довжина не повинна "
                    + "бути нулем або від'ємним числом.");
        }
        this.length = length;
    }
    /**
     * @return об'єм коробки
      */
    public double getVolume() {
        return length * width * height;
    }
    /**
     * @return площа бічної поверхні коробки
     */
    public double getLateralSurfaceArea() {
        return 2 * height * (width + length);
    }
    /**
     * @return площа поверхні коробки
     */
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
    /**
     * @param args аргументи командного рядка
     */
    public static void main(final String[] args) {
        Box box = new Box(7, 52, 32.6);
        System.out.println("Об'єм: " + box.getVolume());
        System.out.println("Площа бічної поверхні: "
                + box.getLateralSurfaceArea());
        System.out.println("Площа поверхні: " + box.getSurfaceArea());
    }
}
