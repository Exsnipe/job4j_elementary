package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void when1and2and2Point5ThenExists() {
        double ab = 1;
        double bc = 2;
        double ac = 2.99;
        boolean rsl = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(rsl);
    }

    @Test
    public void when1And2And3ThenNotExist() {
        double ab = 1;
        double bc = 2;
        double ac = 3;
        boolean rsl = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(rsl);
    }
}