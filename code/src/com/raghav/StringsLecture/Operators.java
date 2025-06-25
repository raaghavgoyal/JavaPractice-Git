package com.raghav.StringsLecture;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        //when an int is added with a String, it is converted to its wrapper
        // class Integer, that will call toString()
        //this is same as after a few steps: "a"+"1"

        System.out.println("Raghav"+new ArrayList<>());
        System.out.println("Raghav"+new Integer(56));
        //System.out.println(new ArrayList<>()+new Integer(56));//this does not work
        //operator + in java is only defined for primitives or when any one of the values is String
        System.out.println(new ArrayList<>()+""+new Integer(56));//works
        System.out.println("a"+'b');
    }
}
