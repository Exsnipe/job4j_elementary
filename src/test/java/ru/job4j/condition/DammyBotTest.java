package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DammyBotTest {

    @Test
    public void whenQuestionHelloThenHello()  {
        String question = "Привет, бот.";
        String ecpected = "Привет, умник.";
        String rsl = DammyBot.answer(question);
        Assert.assertEquals(ecpected, rsl);
    }

    @Test
    public void whenByThenBy() {
        String question = "Пока.";
        String expected = "До скорой встречи.";
        String rsl = DammyBot.answer(question);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenOtherThenDUY() {
        String question = "Сколько будет 2+2?";
        String expected = "Этот вопрос ставит меня в тупик.";
        String rsl = DammyBot.answer(question);
        Assert.assertEquals(expected, rsl);
    }
}