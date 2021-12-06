package com.company.square;

public class Square {
    int height;
    int width;
    String color;

    public void setHeight(int height) {
        if(height>0) this.height = height;
        else System.out.println("height must be>0");
    }

    public void setWidth(int width) {
        if(width>0) this.width = width;
        else System.out.println("width must be>0");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return this.color;
    }
}
