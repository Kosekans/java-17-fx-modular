package com.example.graphics;

public class Rectangular extends Shape {
    double width, height;
    public Rectangular(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double computeArea() {
        return width * height;
    }

    @Override
    public double computeCircumference() {
        return 2 * (width + height);
    }
    public String toString() {
        return "Rectangular{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", width=" + width +
                ", height=" + height +
                ", area=" + computeArea() +
                ", circumference=" + computeCircumference() +
                '}';
    }
}
