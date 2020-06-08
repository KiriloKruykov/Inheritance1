/*
 *
 * Classname: Door
 *
 * 06 June 2020
 *
 * Copyright Kryukov Kirilo KNUTE
 *
 * Module 2 task 2
 * Inheritance
 * 1. Create a child  from the class Rectangle.
 * 2. Create another class as a super class for your one.
 * Or create a daughterly class for your one.
 *
 */
package com.company;

public class Board extends Rectangle{
    private String material;
    private String color;
    private int price;
    private boolean grinding;

    public Board(int length, int width, String material, String color, int price, boolean grinding) {
        super(length, width);
        this.material = material;
        this.color = color;
        this.price = price;
        this.grinding = grinding;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isGrinding() {
        return grinding;
    }

    public void setGrinding(boolean grinding) {
        this.grinding = grinding;
    }

    @Override
    public String toString() {
        return "Board{" +
                "length = " + super.getLength() +
                ", width = " + super.getWidth() +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", grinding=" + grinding +
                '}';
    }
}
