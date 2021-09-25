package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double rsl = SqArea.square(p, k);
        double ecpected = 2;
        double eps = 0.01;
        Assert.assertEquals(ecpected, rsl, eps);
    }

    @Test
    public void whenP8k3Then3() {
        double p = 8;
        double k = 3;
        double rsl = SqArea.square(p, k);
        double expected = 3;
        double eps = 0.01;
        Assert.assertEquals(expected, rsl, eps);
    }

    @Test
    public void whenP5k4Then1() {
        double p = 5;
        double k = 4;
        double rsl = SqArea.square(p, k);
        double expected = 1;
        double eps = 0.01;
        Assert.assertEquals(expected, rsl, eps);
    }
}