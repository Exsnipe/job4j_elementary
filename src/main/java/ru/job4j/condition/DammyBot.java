package ru.job4j.condition;

public class DammyBot {
    public static String answer(String question) {
        String rsl = "Этот вопрос ставит меня в тупик.";
        if (question.equals("Привет, бот.")) {
            rsl = "Привет, умник.";
        }
        if (question.equals("Пока.")) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DammyBot.answer("Привет, бот.");
        System.out.println(rsl);
        rsl = DammyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DammyBot.answer("Как дела?");
        System.out.println(rsl);
    }

}
