package com.raghav.BiarySearch;

//Why BinarySearch?
//Best case: O(1) because size does not matter
//Worst case: O(log n)

// arr = {  2,  4,  6,  9,  11, 12, 14, 18, 19}
//          s                m               e
//ascending order
//arr2 = {19,12,6,5,3,2,-8,-16}
//descending order

//Steps:(consider ascending order)
//1. Find the middle element
//2. target > mid => search in the right part else in the left part
//3. if the middle element == target element => ans
//4. else repeat taking the sub-array as array
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr  = {2,4,6,9,11,12,14,20,36,48};
        int target = 2;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    //return -1 if it doesn't exist
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find the middle element
            //int mid = start+end/2;//might be possible that start+end exceed int range
            int mid = start + (end - start) / 2; //does not exceed int range

            if(target<arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    private static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end-start)/2;
        if(start>=end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target) {
            binarySearch(arr,target,mid+1,end);
        }
        else{
            binarySearch(arr,target,start,mid-1);
        }
        return -1;

    }
}
