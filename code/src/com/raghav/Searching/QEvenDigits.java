package com.raghav.Searching;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class QEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
        System.out.println(digits2(12));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int n : nums){
            if(even(n)){
                count++;
            }
        }
        return count;
    }
    //function  to check whether a number contains even digits or not
    static boolean even(int n) {
        int numberOfDigits = digits(n);
        return numberOfDigits%2 == 0;
    }

    static int digits2(int n){
        if(n<0){
            n = n* -1;
        }
        return (int)(Math.log10(n))+1;
    }
    //count numbers of digits in a number
    static int digits(int n){
        int count = 0;
        if(n==0){
            return 1;
        }
        while(n!=0){
            n /= 10;
            count++;
        }
        return count;
    }
}

