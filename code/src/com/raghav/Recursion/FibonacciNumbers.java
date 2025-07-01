package com.raghav.Recursion;

public class FibonacciNumbers {
    //find n'th fibonacci number
    //0, 1, 1, 2, 3, 5, 8, 13, 21.....series
    //0  1  2  3  4  5  6  7   8......positions
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
