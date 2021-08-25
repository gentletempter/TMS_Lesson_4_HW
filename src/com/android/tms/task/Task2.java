package com.android.tms.task;

public class Task2 {
    public static void wordWithMinNumOfDistinctChars(String myString) {
        String[] stringByWords = myString.split(" ");
        String word = stringByWords[0];
        for (String stringByWord : stringByWords) {
            if (word.chars().distinct().count() > stringByWord.chars().distinct().count()) {
                word = stringByWord;
            }
        }
        System.out.println(word);
    }
}
