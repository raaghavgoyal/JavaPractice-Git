package com.raghav.functionsAndMethods;

import java.util.Arrays;
import java.util.StringTokenizer;

public class VarArgs {
    public static void main(String[] args) {
        //fun(1,2,3,4,5,6,7,8);
        multiple(2,3,"Hello"," Ji");
        demo(1,23,4,45,5);
        demo("1","Hi","Hello");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String...v){

    }
    static void fun(int ...v){// internally taking it as an array on integers
        System.out.println(Arrays.toString(v));
    }
}
