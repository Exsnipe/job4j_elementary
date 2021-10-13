package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void sortMassive() {
        int[] data = {3, 4, 1, 2, 5};
        int[] rsl = SortSelected.sort(data);
        int[] ecpected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(ecpected, rsl);
    }

    @Test
    public void sortMassive1() {
        int[] data = {9, 3, 6, 5, 8, 4, 1, 2, 7};
        int[] rsl = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, rsl);
    }
}