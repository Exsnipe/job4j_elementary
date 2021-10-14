package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class GameWinTest {

    @Test
    public void whenTrue() {
        char[][] inputMatrix =  {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean rsl = GameWin.isWin(inputMatrix);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenFalse() {
        char[][] inputMatrix =  {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean rsl = GameWin.isWin(inputMatrix);
        Assert.assertFalse(rsl);
    }

    @Test
    public void whenTrueAgain() {
        char[][] inputMatrix =  {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean rsl = GameWin.isWin(inputMatrix);
        Assert.assertTrue(rsl);
    }
}