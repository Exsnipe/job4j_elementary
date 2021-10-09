package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class ArrayCharTest {

    @Test
    public void whenWordLikePrefThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e'};
        boolean isSimilar = ArrayChar.startWith(word, pref);
        Assert.assertTrue(isSimilar);
    }

    @Test
    public void whenWordNotLikePrefThenFalse() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'i'};
        boolean isSimilar = ArrayChar.startWith(word, pref);
        Assert.assertFalse(isSimilar);
    }
}