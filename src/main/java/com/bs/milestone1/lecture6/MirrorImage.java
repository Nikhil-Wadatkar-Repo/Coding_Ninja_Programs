package com.bs.milestone1.lecture6;

import java.util.Scanner;

//*****1
//****12
//***123
//**1234
//*12345
public class MirrorImage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i, j;
        for (i = 0; i < num; i++)//outer loop for number of rows(n)
        {
            for (j =  1; j < (num-i); j++) // inner loop for spaces
            {
                System.out.print(" "); // printing space
            }
            int k=1;
            for (j = 0; j <= i; j++) //  inner loop for columns
            {

                System.out.print(k); // print star
                k=k+1;
            }
            System.out.println(); // ending line after each row
        }
    }
}
