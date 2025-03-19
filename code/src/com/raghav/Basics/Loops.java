package com.raghav.Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Q: Print numbers from 1 to  5
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("now with loops");

        for (int i = 0; i<=5 ; i++){
            System.out.println(i);
        }*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            System.out.print("Hello World! ");
            if(i%10==0){
                System.out.println();
            }
        }
    }
}
