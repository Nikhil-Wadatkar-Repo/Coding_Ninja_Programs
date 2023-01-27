package com.bs.milestone1.lecture5;

import java.util.Scanner;

public class TriangularStartPattern {
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 0;
        while (i < num) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }

    }
}
