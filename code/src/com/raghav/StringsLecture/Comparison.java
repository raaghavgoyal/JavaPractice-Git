package com.raghav.StringsLecture;

public class Comparison {
    public static void main(String[] args) {
        String a = "Raghav";
        String b = "Raghav";

        //== i.e. comparator checks if reference variable are pointing to the same object
        System.out.println(a == b);//warining at == because comparison in not done using .equals()

        String i = new String("Raghav");
        String j = new String("Raghav");

        System.out.println( i==j );//gives false even though the values are same
        //but i,j are not pointing to the same object
        //when we only need to check the values use .equals() method
        System.out.println( i.equals(j));// gives true

        System.out.println(a.charAt(2));
    }
}
