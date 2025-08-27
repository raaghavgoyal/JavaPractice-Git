package com.raghav.BitwiseOperators;

public class RangeXOR {
    public static void main(String[] args) {
        // Range xor for a till b => xor(b)^xor(a-1);
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);

        System.out.println(ans);

        //only to check the correctness, will give TLE in case of large numbers
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }
    //this gives XOR from 0 till a
    static int xor(int a){
        if(a%4 == 0){
            return a;
        }else if(a%4 == 1){
            return 1;
        } else if (a%4 == 2) {
            return a+1;
        }else {
            return 0;
        }
    }
}
