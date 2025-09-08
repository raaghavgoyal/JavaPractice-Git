package com.raghav.Recursion1Intro;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(BSRec(arr, 7, 0, arr.length-1));

    }
    static int searchRec(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }else if(arr[m]>target){
            return searchRec(arr, target, s, m-1);
        }else {
            return  searchRec(arr, target, m+1, e);
        }
    }
    private static int BSRec(int[] arr,int n ,int start, int end){
        int mid = start + (end-start)/2;
        if(start<=end) {
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                return BSRec(arr, n, mid + 1, end);
            } else {
                return BSRec(arr, n, start, mid - 1);
            }
        }
        return -1;
    }
}
