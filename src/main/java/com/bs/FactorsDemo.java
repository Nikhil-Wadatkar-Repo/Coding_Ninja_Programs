package com.bs;

import java.util.Scanner;

public class FactorsDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num >= 0 && num <= 10000) {
            int i = 2;
            while (i < num) {
                if (num % i == 0)
                    System.out.print(i + " ");
                i = i + 1;
            }
        }
    }
}
