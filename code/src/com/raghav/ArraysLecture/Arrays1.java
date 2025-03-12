package com.raghav.ArraysLecture;

public class Arrays1 {
    public static void main(String[] args) {
        //Q: store a roll number
        int a = 19;

        //Q: store a persons name
        String name = "Raghav Goyal";

        //Q: store 5 roll numbers
        int rno1 = 1;
        int rno2 = 2;
        int rno3 = 3;
        //very time-consuming

        //using arrays
        //syntax
        //dataType[] variableName = new dataType[size];
        //store 5 roll numbers:
        int [] rnos = new int[5];
        //or directly
        int[] rnos2 = {22,33,13,14,56};

        int [] ros; //declaration of array. ros is getting defined in the stack
        ros = new int [5];  //initialization : actually here object
                            // is being created in the heap memory(heap)
        System.out.println(ros[1]);

        String[] arr = new String[5];
        System.out.println(arr[3]);

    }
}
