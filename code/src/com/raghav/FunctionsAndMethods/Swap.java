package com.raghav.FunctionsAndMethods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //swap  numbers code
        /*int temp = a;
        a = b;
        b = temp;*/

        swap(a,b);
        System.out.println(a+"  "+b);

        String name = "Raghav Goyal";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Vaibhav Gupata";//creating a new object
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        //this change will only be valid in  this function scope only.
    }
}
