package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenXone0Yone0Xtwo2Ytwo0() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenXone0Yone2Xtwo1Ytwo2Then1() {
        Point a = new Point(0, 2);
        Point b = new Point(1, 2);
        double rsl = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenXone2Yone2Xtwo1Ytwo5Then3point162() {
        Point a = new Point(2, 2);
        Point b = new Point(1, 5);
        double rsl = a.distance(b);
        double expected = 3.162;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenXone3Yone2Xtwo6Ytwo4Then3point605() {
        Point a = new Point(3, 2);
        Point b = new Point(6, 4);
        double rsl = a.distance(b);

        double expected = 3.605;
        Assert.assertEquals(expected, rsl, 0.01);
    }

}