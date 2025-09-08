package com.raghav.Recursion2Easy;

public class ReverseANumber {
    //using static variable
    static int sum = 0;
    static void reverseANumber1(int n) {
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseANumber1(n/10);
    }
    //without using static variable
    //sometimes you might need some additional variables in the argument
    //in that case, make another function(helper)
    static int reverseANumber2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }

    //palindrome
    static boolean palin(int n){
        return (n == reverseANumber2(n));
    }

    public static void main(String[] args) {
        //int ans = reverseANumber2(54321);
        System.out.println(palin(1));
    }


}
