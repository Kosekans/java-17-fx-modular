package com.example.graphics;

public class Circle extends Shape {
    private double radius;
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", radius=" + radius +
                ", area=" + computeArea() +
                ", circumference=" + computeCircumference() +
                '}';
    }
}
