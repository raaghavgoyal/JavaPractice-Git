package com.raghav;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position (index starts from 0):");
        int n = sc.nextInt();
        int a = 0,b = 1;
        int result = 0;
        if(n==0){
            result = a;
        }
        else if(n==1){
            result = b;
        }
        else {
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }
        System.out.println(result);


    }
}
