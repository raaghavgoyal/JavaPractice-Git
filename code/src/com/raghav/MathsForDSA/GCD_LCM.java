package com.raghav.MathsForDSA;

public class GCD_LCM {
    public static void main(String[] args) {
        int ans = lcm(2,7);
        System.out.println(ans);
    }
    //of HCF
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd((b%a),a);
    }
    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
