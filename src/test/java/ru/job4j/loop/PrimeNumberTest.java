package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int finish = 5;
        int expected = 3;
        int rsl = PrimeNumber.calc(finish);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when11() {
        int finish = 11;
        int expected = 5;
        int rsl =  PrimeNumber.calc(finish);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when2() {
        int finish = 2;
        int expected = 1;
        int rsl = PrimeNumber.calc(finish);
        Assert.assertEquals(expected, rsl);
    }
}