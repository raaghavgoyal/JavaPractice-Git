package com.raghav.BiarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //consider this as an infinite array
        // in other words you can not use the array.length
        // every thing else is same
        // Note: since this is infinite array, we can never have last element
        // so there will never be a case of index out of bound on right side
        int target = 10;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    private static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end + 1;
            end = end + (end-start+1)*2;//doubling the size of the box every time
            // to improve the time complexity
            start = temp;
        }
         return binarySearch(arr,target,start,end);
    }
    private static int binarySearch(int[] arr, int target, int start, int end) {
        int mid;
        while(start <= end) {
            mid = start +(end-start)/2;

            if (target > arr[mid]) {
                start = mid+1;
            }else if(target < arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
