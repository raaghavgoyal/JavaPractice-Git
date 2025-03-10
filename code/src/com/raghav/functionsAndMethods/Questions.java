package com.raghav.functionsAndMethods;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Questions {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //boolean ans = isPrime(n);
        //System.out.println(ans);
        armstrongNumbers();
    }
    //print all the three digit armstrong numbers
    static void armstrongNumbers(){
        for(int i = 100; i<1000; i++){
            int sum = 0;
            int no = i;
            while(no>0){
                int digit = no%10;
                sum += pow(digit,3);
                no /= 10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
