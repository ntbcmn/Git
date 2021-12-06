package com.company.glasses;

public class MainForGlasses {
    public static void main(String[] args) {
        Glasses glasses = new Glasses();
        glasses.frameColor = "Rose Gold";
        glasses.leftLens = -2.5;
        glasses.rightLens = -2.0;
        glasses.lensesColor = "Transparent";
        System.out.println(
                "Frame color: " + glasses.frameColor + ", " +
                        "Left lens: " + glasses.leftLens + ", " +
                        "Right lens: " + glasses.rightLens + ", " +
                        "Lenses color: " + glasses.lensesColor + "."
        );
        Glasses gl = new Glasses();
        gl.frameColor = "Matte Black";
        gl.leftLens = +0.0;
        gl.rightLens = +0.0;
        gl.lensesColor = "Black";
        System.out.println(
                "Frame color: " + gl.frameColor + ", " +
                        "Left lens: " + gl.leftLens + ", " +
                        "Right lens: " + gl.rightLens + ", " +
                        "Lenses color: " + gl.lensesColor + "."
        );
    }
}
