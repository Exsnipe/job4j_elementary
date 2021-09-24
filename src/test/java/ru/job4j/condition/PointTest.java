package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenXone0Yone0Xtwo2Ytwo0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenXone0Yone2Xtwo1Ytwo2Then1() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 1;
        int y2 = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        double expected = 1;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenXone2Yone2Xtwo1Ytwo5Then3point162() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 1;
        int y2 = 5;
        double rsl = Point.distance(x1, y1, x2, y2);
        double expected = 3.162;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenXone3Yone2Xtwo6Ytwo4Then3point605() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 6;
        int y2 = 4;
        double rsl = Point.distance(x1, y1, x2, y2);
        double expected = 3.605;
        Assert.assertEquals(expected, rsl, 0.01);
    }

}