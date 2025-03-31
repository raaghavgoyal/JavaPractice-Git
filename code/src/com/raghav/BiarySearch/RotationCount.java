package com.raghav.BiarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {4,4,4,4,4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        return findPivotWithDuplicates(arr)+1;
    }
    //use this for non-duplicates
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
    //use this when array contains duplicates
    private static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // If elements at start, mid, and end are equal, handle duplicates carefully
            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                // Check if start or end are pivots
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                // Skip duplicates
                start++;
                end--;
            } else if (nums[start] <= nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                // Left side is sorted; move to the right
                start = mid + 1;
            } else {
                // Pivot is in the left part
                end = mid - 1;
            }
        }
        return -1;  // Pivot not found
    }
}
