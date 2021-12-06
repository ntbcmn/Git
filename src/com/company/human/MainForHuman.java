package com.company.human;

import com.company.square.Square;

import java.util.Scanner;

public class MainForHuman {

    public static void main(String[] args) {
        Human human = new Human();
        human.setId(125);
        human.setHeight(150);
        human.setWeight(65.3);
        human.setName("Bob");
        System.out.println(
                "ID: " + human.getId() + ", " +
                        "Height: " + human.getHeight() + ", " +
                        "Weight: " + human.getWeight() + ", " +
                        "Name: " + human.getName() + "."
        );
//        HOMEWORK
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Square sq = new Square();
        System.out.println("Input height, width, color: ");
        sq.setHeight(sc.nextInt());
        sq.setWidth(sc.nextInt());
        sq.setColor(sc1.nextLine());
        System.out.println(
                "Height: " + sq.getHeight() + ", " +
                        "Width: " + sq.getWidth() + ", "
                        + "Color: " + sq.getColor() + "."
        );
    }
}
