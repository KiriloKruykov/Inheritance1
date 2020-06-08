/*
 *
 * Classname: Triangle
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

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int side) {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    // 5 methods.
    //1. Method for finding the perimeter.
    public double getPerimeter(){
        return this.getSideA() + this.getSideB() + this.getSideC();
    }
    //2. Method for finding the area.
    public double getArea(){
        double p = (this.getSideA() + this.getSideB() + this.getSideC())/2;
        return Math.sqrt (p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }
    //3. Method for "Triangle is a equilateral triangle?"
    public boolean isEquilateraltriangle() {
        boolean result = true;
        if (this.getSideA() == this.getSideB()&&getSideA()==getSideC()&&getSideB()==getSideC()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    //4.Method for "Triangle is a isosceles triangle?"
    public boolean isIsoscelestriangle() {
        boolean result = true;
        if (this.getSideA() == this.getSideB()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    //5.Method for finding the Mediana.
   /* public double getMediana () {
        return Math.sqrt
    }*/

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

}
