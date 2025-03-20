package com.raghav.LinearSearch;
// https://leetcode.com/problems/richest-customer-wealth/
public class QMaxWealth {
    public static void main(String[] args) {
    }
    public static int maximumWealth(int[][] accounts){
        //iteration of a 2D array
        int max = 0;
        for(int person = 0; person < accounts.length ; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
