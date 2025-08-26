package com.raghav.BitwiseOperators;

public class SetBitsCount {
    public static void main(String[] args) {
        int n = 23567;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

//        while (n>0){
//            n -= n&(-n);
//            count++;
//        }
        while (n>0){
            n = n&(n-1);
            count++;
        }

        return count;
    }
}
