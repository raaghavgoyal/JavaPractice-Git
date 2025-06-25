package com.raghav.StringsLecture;

public class StringAndStringBuilder {
    public static void main(String[] args){
        //int a = 10;//primitive so stored in stack
        //int[] arr = {2,3,5,4,19};//ref variable arr is in stack,
        // its pointing to this object in heap

        //Strings are immutable
        String name = "Raghav Goyal";
        String a = "Raghav";
        System.out.println(a);
        a = "Goyal";
        System.out.println(a) ;
    }
}
