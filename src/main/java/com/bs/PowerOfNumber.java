package com.bs;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int answer=0;
        int i=1;
        if(n==0 ){
            answer=1;
        }
        else{
            while(i<=n){
                answer= (int) Math.pow(x,n);
                i=i+1;
            }
        }
        System.out.println(answer);
    }
}
