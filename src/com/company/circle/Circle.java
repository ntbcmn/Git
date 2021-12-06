package com.company.circle;

public class Circle {
    double radius;
    String color;
    boolean transparent = false;

    public Circle(double radius, String color, boolean transparent) {
        this.radius = radius;
        this.color = color;
        this.transparent = transparent;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(boolean transparent) {
        this.transparent = transparent;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInvisible(boolean transparent) {
        this.transparent = transparent;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isTransparent() {
        return transparent;
    }

    public void circlesLength() {
        System.out.println(
                "Circle`s length = " + 2 * 3.14 * getRadius()
        );
    }

    public void circlesSquare() {
        System.out.println(
                "Circle`s square = " + 3.14 * getRadius() * getRadius()
        );
    }

    public void printCircle() {
        System.out.println(
                "Radius: " + getRadius() + ";" + "\n" +
                        "Color: " + getColor() + ";" + "\n" +
                        "Transparency: " + isTransparent() + ";" + "\n"
        );

    }
}
