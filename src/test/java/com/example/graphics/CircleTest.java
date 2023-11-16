package com.example.graphics;

import com.example.graphics.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CircleTest {
    private Circle circle = null;
    private double x,y,radius;
    @BeforeEach
    public void before() {
        x = 0;
        y = 0;
        radius = 1;
        this.circle = new Circle(x, y, radius);
    }
    @Test
    public void testAdd() {
        assertEquals (circle.computeArea(), Math.PI * radius * radius);
        assertEquals (circle.computeCircumference(), 2 * Math.PI * radius);
    }
}
