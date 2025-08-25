package com.raghav.BitwiseOperators;

public class FindUnique {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,3,2,1,6};
        System.out.println(findNonRepeating(arr));
    }

    private static int findNonRepeating(int[] arr) {
        int ans = 0;
        for(int a: arr){
            ans = ans^a;
        }
        return ans;
    }
}
