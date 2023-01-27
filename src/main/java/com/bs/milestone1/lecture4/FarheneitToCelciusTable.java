package com.bs.milestone1.lecture4;

import java.util.Scanner;

public class FarheneitToCelciusTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt(), E = scan.nextInt(), W = scan.nextInt(), Celsius = 0;

        while (S <= E) {
            Celsius = ((S - 32) * 5) / 9;
            System.out.println(S + " " + Celsius);
            S = S + W;
        }

    }
}
