package com.company.circle;

import java.util.Random;

public class MainForCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(35.3 * 3, "Purple", false);
        circle.printCircle();
        circle.circlesSquare();
        circle.circlesLength();
        Random random = new Random(101);
        int[] circles = new int[random.nextInt()];
        System.out.println(circles);
    }
}
