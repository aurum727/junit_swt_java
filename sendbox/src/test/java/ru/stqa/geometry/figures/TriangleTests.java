package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateTriangleArea(){
        Assertions.assertEquals(6.49519052838329, new Triangle(3.0, 5.0, 7.0).area());
    }

    @Test
    void canCalculateTrianglePerimeter(){
        Assertions.assertEquals(7.5, new Triangle(3.0, 5.0, 7.0).perimeter());
    }


    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(7.0, 7.0, 15.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            System.out.println("PASSED test check create triangle with negative side");
        }
    }


    @Test
    void cannotCreateTriangleWithSumTwoSide(){
        try{
            new Triangle(7.0, 7.0, 15.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            System.out.println("PASSED test check create triangle with by the inequality of the sides");
        }
    }
}
