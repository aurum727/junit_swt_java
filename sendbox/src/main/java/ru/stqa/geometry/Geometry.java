package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;


public class Geometry {
    public static void main(String[] args) {
//        Square.printArea(new Square(3.0));
//        Square.printArea(new Square(5.0));
//        Square.printArea(new Square(7.0));
//
//        Rectangle.printRectangleArea(4.0, 7.0);
//        Rectangle.printRectangleArea(6.0, 2.0);
//        Rectangle.printRectangleArea(49.0, 27.0);

        Triangle p = new Triangle(7.0, 7.0, 10.0);
        Triangle.printArea(p);
        System.out.println(p.perimeter());
    }

}
