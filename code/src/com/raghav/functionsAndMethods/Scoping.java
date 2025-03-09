package com.raghav.functionsAndMethods;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
    }
    static void random(int marks){
        int num = 76;
        System.out.println(marks);
        System.out.println(num);
    }
}
