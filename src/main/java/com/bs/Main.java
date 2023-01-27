package com.bs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> names = Arrays.asList("ankur", "nikhil", "dhanu", "pooja", "mandu");
//        reverseList(names);
//        reverseNumber();

    }

    private static void reverseList(List<String> names) {
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void reverseNumber() {
        int number = 12345, rev = 0;
        for (int i = number; i > 0; i = i / 10) {
            int lastDigit = i % 10;
            rev = lastDigit + (rev * 10);

        }
        System.out.println("Reverse number :" + rev);
    }
}