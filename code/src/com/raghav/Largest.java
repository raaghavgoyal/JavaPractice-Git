package com.raghav;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three integers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //Q: Find the largest of the 3 numbers
        int max = a;
        /*if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }*/
        max = Math.max(a,Math.max(b,c));
        System.out.println("The max input is: "+max);
    }
}
