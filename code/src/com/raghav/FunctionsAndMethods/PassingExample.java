package com.raghav.FunctionsAndMethods;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Raghav Goyal";
        greet(name);

        int a = 50;
        int result = inc(a);
        System.out.println("result = "+result);
        System.out.println("a = "+a);
    }

    private static int inc(int x) {
        return ++x;
    }

    private static void greet(String naam) {
        System.out.println(naam);
    }
}
