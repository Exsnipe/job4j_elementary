package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {5, 4, 3};
        boolean isEq = EqLast.check(left, right);
        Assert.assertTrue(isEq);
    }

    @Test
    public void whenIsNotEq() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {3, 3, 4};
        boolean isEq = EqLast.check(left, right);
        Assert.assertFalse(isEq);
    }
}