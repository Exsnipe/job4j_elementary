package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenLeft1Right2ThenMax2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int rsl = Max.max(1, 2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeft2Right5THenMax5() {
        int left = 2;
        int right = 5;
        int ecpected = 5;
        int rsl = Max.max(left, right);
        Assert.assertEquals(ecpected, rsl);
    }

    @Test
    public void whenLeft9Right4ThenMax9() {
        int left = 9;
        int right = 4;
        int ecpected = 9;
        int rsl = Max.max(left, right);
        Assert.assertEquals(ecpected, rsl);
    }

    @Test
    public void  whenLeft13Right13Then13() {
        int left = 13;
        int right = 13;
        int expected = 13;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }
}