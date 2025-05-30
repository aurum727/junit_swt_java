package ru.stqa.geometry.figures;

public record Rectangle(double sideA, double sideB) {
    public static void printRectangleArea(double sideA, double sideB) {
        System.out.println("Площадь прямоугольника со сторонами "
                + sideA + " и " + sideB + " = " + squareRectangle(sideA, sideB));
    }

    private static double squareRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }
}
