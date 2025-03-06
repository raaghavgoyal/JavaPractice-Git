package com.raghav;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String fruit = sc.nextLine();
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Water Melon" -> System.out.println("A watery fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit name.");
        }*/
        int day = sc.nextInt();
        switch (day){
            case 1-> {
                System.out.println("Monday");
                System.out.println("Week has started.");
            }
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }
/*
        //use of .equals in case of string comparison
        String s = "Raghav";
        String s1 =  new String("Raghav");
        System.out.println(s.equals(s1));
*/

    }
}
