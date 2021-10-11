package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndsWithTest {

    @Test
    public void whenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean isEndWith = EndsWith.endWith(word, post);
        Assert.assertTrue(isEndWith);
    }

    @Test
    public void whenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean isEndWith = EndsWith.endWith(word, post);
        Assert.assertFalse(isEndWith);
    }
}