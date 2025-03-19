package com.raghav.Basics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >= 'A' && ch<='Z'){
            System.out.println("Uppercase Letter with ASCII value : "+ (int) ch);
        }else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase letter with ASCII value : "+(int)ch);
        }
        System.out.println(ch);
    }
}
