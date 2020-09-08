package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 2);
        double rsl = a.distance3d(b);
        assertThat(rsl, is(3.61));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 4, 6);
        double rsl = a.distance3d(b);
        assertThat(rsl, is(7.21));
    }
}