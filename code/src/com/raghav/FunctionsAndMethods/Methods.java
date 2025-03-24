package com.raghav.FunctionsAndMethods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //functions inside a class are called methods
        // therefore we call them method in java

        //Q: Take an input of two numbers and print the sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: "+(num1+num2));
        // without brackets + concatenates the strings in this case

    }
}
