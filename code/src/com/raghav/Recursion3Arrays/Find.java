package com.raghav.Recursion3Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,4,5};
        System.out.println(find(arr, 4,0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 4,arr.length-1));
        findAllIndex(arr,4,0);
        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndexUsingArrayList(arr, 4, 0, list);
        System.out.println(ans);
        System.out.println(list);//both list and ans are pointing to the same list
    }

    static boolean find(int[] arr , int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target,index+1);
    }

    static int findIndex(int[] arr , int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target,index+1);
        }
    }

    static int findIndexLast(int[] arr , int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndexLast(arr, target,index-1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr , int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList findAllIndexUsingArrayList(int[] arr , int target, int index, ArrayList<Integer> list){
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndexUsingArrayList(arr, target, index + 1, list);
    }
}
