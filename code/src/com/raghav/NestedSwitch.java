package com.raghav;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("This program illustrates nested switch case.");
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String dept = sc.next();
        switch (empId) {
            case 1 -> System.out.println("Raghav");
            case 2 -> System.out.println("Vaibhav");
            case 3 -> {
                System.out.println("Employee no. 3");
                switch (dept) {
                    case "IT" -> {
                        System.out.println("IT department");
                        System.out.println("Hello ji");
                    }
                    case "HR" -> System.out.println("Management Department");
                    default -> System.out.println("No Department assigned.");
                }
            }
            default -> System.out.println("Enter correct Employee ID");
        }
    }
}
