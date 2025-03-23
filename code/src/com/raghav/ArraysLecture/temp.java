package com.raghav.ArraysLecture;

import java.util.ArrayList;
import java.util.List;

public class temp {

        public static void main(String[] args) {
            // Raw type List without specifying datatype
            List rawList = new ArrayList();

            // Adding elements of different types
            rawList.add(10);       // Integer
            rawList.add("Hello");  // String
            rawList.add(true);     // Boolean

            // Printing the raw List
            System.out.println(rawList);
        }
    }