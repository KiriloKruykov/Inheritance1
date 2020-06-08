/*
 *
 * Classname: Main
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

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 4);
        System.out.println(rectangle1);

        Board myboard = new Board(3, 4, "wood", "light", 1000, true);
        System.out.println(myboard);

        Triangle myisoscelestriangle = new IsoscelesTriangle(3,4);
        System.out.println(myisoscelestriangle);
    }
}
