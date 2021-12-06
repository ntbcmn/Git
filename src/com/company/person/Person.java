package com.company.person;

public class Person {
    String name;
    int age;
    double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }


    public void print() {
        System.out.println(
                "Name: " + getName() + "\n" +
                        "Age: " + getAge() +
                        "Height: " + getHeight()
        );
    }
}
