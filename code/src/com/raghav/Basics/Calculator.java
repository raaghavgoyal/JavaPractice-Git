package com.raghav.Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input from user till the user does not press x or X
        int ans = 0;
        System.out.println("Note: Press x or X to exit.");
        System.out.println("Welcome to the calculator application!");
        while(true){
            // take operator as input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
                if(op == '+'|| op == '-'||op == '*'||op == '/'||op == '%'){
                    System.out.println("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if(op=='+'){
                        ans = a+b;
                    }else if(op == '-'){
                        ans = a-b;
                    }else if(op == '*'){
                        ans = a*b;
                    }else if(op == '/'){
                        ans = a/b;
                    }else{
                        ans = a%b;
                    }
                    System.out.println(ans);
                }
                else if(op=='x'||op=='X'){
                    break;
                }
                else{
                    System.out.println("Invalid input!");
                }
        }
    }
}
