package ru.stqa.geometry.figures;
import  java.lang.Math;

public record Triangle(double sideA, double sideB, double sideC) {

    public Triangle {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Triangle with a negative side does not exist");
        }

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Sum of the two sides of a triangle exceeds the length of the third side.");
        }
    }

    public static void printArea(Triangle t){
        String text = String.format("Площадь площадь треугольлника (%f, %f, %f,) = %f",
                t.sideA, t.sideB, t.sideC, t.area());
        System.out.println(text);
    }

    public double perimeter() {
        return (this.sideA+this.sideB+this.sideC)/2;
    }

    public double area() {
        double p = this.perimeter();
        return Math.sqrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC));
    }
}
