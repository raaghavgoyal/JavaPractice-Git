package com.raghav.Searching;

public class FindMin {
    public static void main(String[] args) {
        int[] arr  = {18,12,-7,3,14,28};
        //find min element in the array
        System.out.println(min(arr));
    }
    //assume arr.length != 0
    static int min(int [] arr){
        int m = arr[0];
        for(int temp : arr){
            if(temp<m){
                m = temp;
            }
        }
        return m;
    }
}
