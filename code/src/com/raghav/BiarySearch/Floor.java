package com.raghav.BiarySearch;

public class Floor {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        //            0  1  2  3   4   5   6
        int target = 16;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    //return the index of the element smaller than or equal to target
    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start+(end-start)/2;
            if(arr[mid]== target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
