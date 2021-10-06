package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FitnessTest {

    @Test
    public void whenIvan95NNik90Then0() {
        int ivan = 95;
        int nik = 90;
        int monthExpected = 0;
        int monthRsl =  Fitness.calc(ivan, nik);
        Assert.assertEquals(monthExpected, monthRsl);
    }

    @Test
    public void whenIvan90Nik95Then1() {
        int ivan = 90;
        int nik = 95;
        int monthExpected = 1;
        int monthRsl = Fitness.calc(ivan, nik);
        Assert.assertEquals(monthExpected, monthRsl);
    }

    @Test
    public void whenIvan50Nik90THen2() {
        int ivan = 50;
        int nik = 90;
        int monthExpected = 2;
        int monthRsl = Fitness.calc(ivan, nik);
        Assert.assertEquals(monthExpected, monthRsl);
    }

    @Test
    public void whenIvan90Nik90Then1() {
        int ivan = 90;
        int nik = 90;
        int monthExpected = 1;
        int monthRsl = Fitness.calc(ivan, nik);
        Assert.assertEquals(monthExpected, monthRsl);
    }
}