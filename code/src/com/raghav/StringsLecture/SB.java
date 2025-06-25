package com.raghav.StringsLecture;

public class SB {
    public static void main(String[] args) {
        //StringBuilder is mutable, so it is more efficient to use
        // in case frequent modifications are required
        //since, in case of String a lot of memory and time was wasted
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+ i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}
