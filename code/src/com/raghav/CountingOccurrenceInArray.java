package com.raghav;

import java.util.Scanner;

public class CountingOccurrenceInArray {
    public static void main(String[] args) {
        int [] arr = {1,3,3,42,7,7,7,7,7,3,4,5,4,2,1,4,6,3,0,3,52,4,63,1,1,4,6,7};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int a: arr){
            if(a==n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
