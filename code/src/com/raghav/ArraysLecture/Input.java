package com.raghav.ArraysLecture;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
//        int [] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 431;
//        arr[3] = 305;
//        arr[4] = 715;
//        System.out.println(arr[3]);

        //input using for loop
//        for(int i = 0; i<arr.length ; i++){
//            arr[i] = in.nextInt();
//        }
//        for (int j : arr) {//for every element of array print the element
//            System.out.print(j + " ");// here j represents element of the array
//        }
//        System.out.println(Arrays.toString(arr));

        //array of objects
        String [] str = new String[4];
        for (int i = 0; i< str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));

    }
}
