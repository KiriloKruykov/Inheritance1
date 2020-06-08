/*
 *
 * Classname: Rectangle
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

import java.util.Objects;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    // 1. Method for finding the perimeter

    public double getPerimeter() {
        return 2 * this.getLength() + 2 * this.getWidth();
    }

    // 2. Method for finding the area

    public double getArea() {
        return this.getLength()* this.getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}