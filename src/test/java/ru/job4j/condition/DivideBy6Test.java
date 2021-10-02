package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideBy6Test {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String expected = "Исходное число делится на 6.";
        String rsl = DivideBy6.checkNumber(in);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String expected = "Исходное число делится на 3, но не является четным.";
        String rsl = DivideBy6.checkNumber(9);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNumberNotDivideBy3AndEven() {
        int in;
        String expected = "Исходное число не делится на 3, но является четным.";
        String rsl = DivideBy6.checkNumber(14);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenNumberNotDivideBy3AndNotEven() {
        int i = 25;
        String expected = "Исходное число не делится на 3 и не является четным.";
        String rsl = DivideBy6.checkNumber(25);
        Assert.assertEquals(expected, rsl);
    }
}