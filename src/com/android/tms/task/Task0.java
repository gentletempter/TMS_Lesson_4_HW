package com.android.tms.task;//String format: xxxx-yyy-xxxx-yyy-xyxy, x - digit, y - letter

public class Task0 {
    public static void getFirstTwoBlocksOfFourDigits(String documentNumber) {
        char[] dst = new char[8];
        documentNumber.getChars(0, 4, dst, 0);
        documentNumber.getChars(9, 13, dst, 4);
        System.out.println(dst);
    }

    public static void replaceThreeLettersBlocksToSpace(String documentNumber) {
        System.out.println(documentNumber.substring(0, 5) + "   " + documentNumber.substring(8, 14) + "   " + documentNumber.substring(17));
    }

    public static void getOnlyLettersInLowerCase(String documentNumber) {
        String[] blocksOfDocumentNumbers = documentNumber.split("-");
        String resultString = blocksOfDocumentNumbers[1] + "/" + blocksOfDocumentNumbers[3] + "/"
                + blocksOfDocumentNumbers[4].charAt(1) + "/" + blocksOfDocumentNumbers[4].charAt(3);
        System.out.println(resultString.toLowerCase());
    }

    public static void getOnlyLettersInUpperCaseUsingStringBuilder(String documentNumber) {
        StringBuilder stringBuilder = new StringBuilder(documentNumber.toUpperCase());
        stringBuilder.delete(0, 5);
        stringBuilder.delete(3, 8);
        stringBuilder.setCharAt(3, '/');
        stringBuilder.setCharAt(7, '/');
        stringBuilder.setCharAt(10, '/');
        stringBuilder.deleteCharAt(8);
        stringBuilder.insert(0, "Letters:");
        System.out.println(stringBuilder);
    }

    public static void checkSequenceContains(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Document number contains \"abc\"");
        } else {
            System.out.println("Document number does not contain \"abc\"");
        }
    }

    public static void checkSequenceStart(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Document number starts with \"555\"");
        } else {
            System.out.println("Document number does not start with \"555\"");
        }
    }

    public static void checkSequenceEnd(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Document number ends with \"1a2b\"");
        } else {
            System.out.println("Document number does not end with \"1a2b\"");
        }
    }
}
