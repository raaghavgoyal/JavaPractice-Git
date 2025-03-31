package com.raghav.BiarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }
    public int splitArray(int [] nums , int m){
        int start = 0;
        int end = 0;
        for (int num : nums) {
            start = Math.max(start, num);
            //in the end of the loop this will contain the max element from array
            end += num;
        }

        //binary search
        while (start<end){
            //try for middle as a potential answer
            int mid = start+(end-start)/2;
            //calculate how many pieces you can divide this in this max sum
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(sum+num> mid){
                    // you can not add this in this subarray
                    // so make a new subarray
                    //say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces>m){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return end;// here start == end
    }
}
