/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author hp
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(7.0, 3.0);
        System.out.println("Rectangle One:");
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Area: " + rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle(10.0, 4.0);
        System.out.println("Rectangle Two:");
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
        System.out.println("Area: " + rectangle2.calculateArea());
    }
}
