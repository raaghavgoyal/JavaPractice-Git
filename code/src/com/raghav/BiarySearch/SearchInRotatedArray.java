package com.raghav.BiarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {8,9,2,3,4};
        int target = 9;
        int pivot = findPivot(arr);
        int r1 = binarySearch(arr,0,pivot,target);
        if(r1>=0){
            System.out.println(r1);;
        }
        else {
            System.out.println(binarySearch(arr, pivot + 1, arr.length - 1, target));
        }
    }

    private static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid = -1;
        while(start<end){
            mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            else{
                if(nums[mid]>nums[0]){
                    //move right
                    start = mid+1;
                }
                else{
                    //move left
                    end = mid;
                }
            }
        }
        return start;
    }
    private static int binarySearch(int [] arr, int start, int end, int target){
        int mid = -1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
