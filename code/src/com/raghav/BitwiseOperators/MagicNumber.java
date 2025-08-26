package com.raghav.BitwiseOperators;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 7;
        int ans = 0;
        int lsd = 0;
        int p = 1;
        while(n>0){
            lsd = n & 1;
            n = n >> 1;
            ans += lsd * Math.pow(5,p++);
        }
        System.out.println("Magical Number: " + ans);
    }
}
