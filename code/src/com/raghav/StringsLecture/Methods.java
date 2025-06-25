package com.raghav.StringsLecture;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Raghav Goyal";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.getBytes()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println("          Raghav        ".strip());
        System.out.println(Arrays.toString(name.split("a")));
    }
}
