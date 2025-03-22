package com.raghav.BiarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6 ,6 ,6 ,6 ,6, 6, 7, 8, 9};
        int target = 6;//
        //we don't know if it's sorted in ascending or descending order
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    private static int orderAgnosticBS(int[] arr, int target) {
        //find whether tie array is sorted on ascending or descending order
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //int mid = start+end/2;//might be possible that start+end exceed int range
            int mid = start + (end - start) / 2; //does not exceed int range
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
