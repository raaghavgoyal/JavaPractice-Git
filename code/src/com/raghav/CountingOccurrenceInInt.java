package com.raghav;

import java.util.Scanner;

public class CountingOccurrenceInInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        System.out.print("Enter the digit to be counted: ");
        int n = sc.nextInt();
        long cur = 0;
        int count = 0;
        while (num != 0) {
            cur = num % 10;
            num /= 10;
            if (cur == n) {
                count++;
            }
        }
        System.out.println(count + " occurrences detected.");
    }
}
