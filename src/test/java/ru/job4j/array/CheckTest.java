package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckTest {

    @Test
    public void whenAllTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = Check.mono(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenAllFalseThenTrue() {
        boolean[] input = new boolean[] {false, false, false, false, false};
        boolean result = Check.mono(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDifferentFlagsThenFalse() {
        boolean[] input = new boolean[] {true, true, false, false, true, true};
        boolean result = Check.mono(input);
        Assert.assertFalse(result);
    }
}