package com.company.hoodies;

public class MainForHoodies {

    public static void main(String[] args) {
        Hoodies hod = new Hoodies();
        hod.material = "Cotton";
        hod.size = "L";
        hod.color = "Black & Gold";
        hod.creator = "Adidas";
        System.out.println(
                "Material: " + hod.material + ", " +
                        "Size: " + hod.size + ", " +
                        "Color: " + hod.color + ", " +
                        "Creator: " + hod.creator + "."
        );
        Hoodies hood = new Hoodies();
        hood.material = "Synthetics";
        hood.size = "XXL";
        hood.color = "White & Red";
        hood.creator = "Nike";
        System.out.println(
                "Material: " + hood.material + ", " +
                        "Size: " + hood.size + ", " +
                        "Color: " + hood.color + ", " +
                        "Creator: " + hood.creator + "."
        );
        Hoodies h = new Hoodies();
        h.material = "Cotton";
        h.size = "S";
        h.color = "Beige";
        h.creator = "Puma";
        System.out.println(
                "Material: " + h.material + ", " +
                        "Size: " + h.size + ", " +
                        "Color: " + h.color + ", " +
                        "Creator: " + h.creator + "."
        );



    }
}
