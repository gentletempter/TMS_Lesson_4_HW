package com.android.tms.task;

public class Task1 {
    public static void getLongestWord(String myString) {
        String[] stringByWords = myString.split(" ");
        String longestWord = " ";
        String shortestWord = stringByWords[0];
        for (int i = 0; i < stringByWords.length; i++) {
            if (longestWord.length() <= stringByWords[i].length()) {
                longestWord = stringByWords[i];
            }
            if (shortestWord.length() >= stringByWords[i].length()) {
                shortestWord = stringByWords[i];
            }
        }
        System.out.println(shortestWord);
        System.out.println(longestWord);
    }
}
