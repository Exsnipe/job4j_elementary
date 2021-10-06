package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenStart1Finish10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int rsl = Counter.sumByEven(1, 10);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenStart5Finish20Then104() {
        int start = 5;
        int finish = 20;
        int expected = 104;
        int rsl = Counter.sumByEven(5, 20);
        Assert.assertEquals(expected, rsl);
    }
}