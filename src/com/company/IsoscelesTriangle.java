/*
 *
 * Classname: IsoscelesTriangle
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
//Constructor for class IsoscelesTriangle
public class IsoscelesTriangle extends Triangle {
    private int sideA;
    private int sideB;

    public IsoscelesTriangle( int sideA, int sideB) {
        super(sideA, sideA, sideB);
        this.sideA = sideA;
        this.sideB = sideB;
    }
//Getter and Setters for class IsoscelesTriangle
    @Override
    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
//toString for class IsoscelesTriangle
    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                ", isEquilateraltriangle=" + isEquilateraltriangle() +
                ", isIsoscelestriangle=" + isIsoscelestriangle() +
                '}';
    }
}




