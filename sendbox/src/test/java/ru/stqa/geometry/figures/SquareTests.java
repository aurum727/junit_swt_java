package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class SquareTests {
    @Test
    void canCalculateArea(){
        var s = new Square(5.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter(){
        Assertions.assertEquals(20, new Square(5.0).perimeter());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-7.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }
    }

}

