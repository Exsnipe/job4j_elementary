package ru.job4j.array;

public class EndsWith {
    public static boolean endWith(char[] word, char[]  post) {
            String str = new String(word);
            String postStr = new String(post);
            return str.endsWith(postStr);
    }
}

