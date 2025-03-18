package com.raghav.ArraysLecture;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        //we can not pass primitives in case of ArrayList, we can only pass Wrapper classes
//        list.add(67);
//        list.add(1);
//        list.add(21);
//        list.add(53);
//        list.add(32);
//        list.add(32);
//        list.add(11);

        //LSystem.out.println(list.contains(32134));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);

        System.out.println(list);
        //we can directly in print an ArrayList
        //because this internally calls its toString method

        //input
        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));//pass index here
            //list[index] syntax will not work here
        }
        System.out.println(list);










    }
}
