package com.raghav.Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 9;
        System.out.println(linearSearch(arr,target,2,3));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        //run a for loop
        for (int i = start; i <= end; i++) {
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
