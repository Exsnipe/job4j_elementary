package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        double amount = 1000;
        double salary = 1200;
        double percent = 1;
        int expected = 1;
        int rsl = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when2Year() {
        double amount = 100;
        double salary = 120;
        double percent = 50;
        int expected = 2;
        int rsl = Mortgage.year(amount, salary, percent);
        Assert.assertEquals(expected, rsl);
    }
}