package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenWeight181Then93point15() {
        short height = 181;
        double eps = 0.01;
        double rsl = Fit.manWeight(height);
        double expected = 93.15;
        Assert.assertEquals(expected, rsl, eps);
    }

    @Test
    public void whenWeight170Then69() {
        short height = 170;
        double eps = 0.01;
        double rsl = Fit.womanWeight(height);
        double expected = 69;
        Assert.assertEquals(expected, rsl, eps);
    }
}