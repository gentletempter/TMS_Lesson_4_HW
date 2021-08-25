package com.android.tms.task;

public class Task3 {
    public static void findPalindrome(String myString, int i) {
        String[] stringByWords = myString.split(" ");
        try {
            i--;
            if (stringByWords[i].equalsIgnoreCase(String.valueOf(new StringBuilder(stringByWords[i]).reverse()))) {
                System.out.println(stringByWords[i] + " - Palindrome");
            } else {
                System.out.println(stringByWords[i] + "- Not a palindrome");
            }
        } catch (Exception ex) {
            System.out.println("Invalid number of word!");
        }
    }
}
