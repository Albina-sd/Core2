package com.java.core;

public class Task3 {

    /*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }

    public static boolean fuzzySearch(String patternStr, String text){
        StringBuilder textSB = new StringBuilder(text);
        int index = 0, i = 0;
        char symbol;

        while (i < patternStr.length() - 1){
            symbol = patternStr.charAt(i);
            index = textSB.indexOf(String.valueOf(symbol));

            if (index == -1){
                return false;
            }

            textSB = textSB.replace(0, index+1, "");

            if (textSB.length() == 0 && i < patternStr.length() - 1) {
                return false;
            }

            i++;
        }

        return true;
    }
}
