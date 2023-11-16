package com.example.graphics;

import com.example.graphics.Rectangular;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangularTest {
    static Rectangular rectangular;
    @BeforeEach
    public void before() {
        double x = 0;
        double y = 0;
        double width = 1;
        double height = 1;
        this.rectangular = new Rectangular(x, y, width, height);
    }
    @Test
    public void computeArea() {
        assertEquals (rectangular.computeArea(), 1);
    }
    @Test void computeCircumference() {
        assertEquals (rectangular.computeCircumference(), 4);
    }
}
