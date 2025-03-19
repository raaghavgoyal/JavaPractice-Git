package com.raghav.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        //{18, 12, 9, 14, 77, 50}
        //  0   1   2   3  4   5
        //Find whether 14 exists in the array or not.

        //Time Complexity: Best Case= O(1), Worst Case= O(n)
        int[] nums = {18, 12, 9, 14, 77, 50};
        int target = 91;
        System.out.println(linearSearch2(nums, target));
    }
    //search the target and return the element
    static int linearSearch2(int [] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MIN_VALUE;
    }

    //search the target and return true or fase
    static boolean linearSearch3(int [] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
