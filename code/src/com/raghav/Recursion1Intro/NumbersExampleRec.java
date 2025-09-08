package com.raghav.Recursion1Intro;

public class NumbersExampleRec {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
