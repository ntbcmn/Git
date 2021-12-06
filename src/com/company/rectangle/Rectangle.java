package com.company.rectangle;

public class Rectangle {
    int height;
    int width;
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public void printRec(){
        System.out.println(
                "Height: " + getHeight() + "; " + "\n" +
                        "Width: " + ";"
        );
    }
}

