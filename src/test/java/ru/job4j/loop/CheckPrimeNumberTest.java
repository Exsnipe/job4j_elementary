package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {

    @Test
    public void when5True() {
        int number = 5;
        boolean isPrime = CheckPrimeNumber.check(number);
        Assert.assertTrue(isPrime);
    }

    @Test
    public void when4False() {
        int number = 4;
        boolean isPrime = CheckPrimeNumber.check(number);
        Assert.assertFalse(isPrime);
    }

    @Test
    public void when1False() {
        int number = 1;
        boolean isPrime = CheckPrimeNumber.check(number);
        Assert.assertFalse(isPrime);
    }
}