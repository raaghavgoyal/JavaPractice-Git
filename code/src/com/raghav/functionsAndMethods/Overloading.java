package com.raghav.functionsAndMethods;

import java.util.Arrays;

public class Overloading {
    //number or type of arguments should be different
    public static void main(String[] args) {
        fun(5);
        fun("Raghav");
        fun(1, 3);
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int a, int b){
        System.out.println(a+b);
    }
}
