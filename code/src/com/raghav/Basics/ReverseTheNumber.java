package com.raghav.Basics;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long l = sc.nextLong();
        long rev = 0;
        while(l!=0){
            rev = rev*10 + l%10;
            l = l/10;
        }
        System.out.println(rev+" is the reverse of given number.");
    }
}
