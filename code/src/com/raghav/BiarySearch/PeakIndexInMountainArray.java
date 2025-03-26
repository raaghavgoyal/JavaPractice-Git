package com.raghav.BiarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,1};
        int peak = peakOfMountain(arr);
        System.out.println(peak);
    }

    private static int peakOfMountain(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        int mid = -1;
        while(start<end){
            mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;//or end
        //because start and end both will point to the peak element in the mountain array
    }
}
