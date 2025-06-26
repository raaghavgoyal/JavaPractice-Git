package com.raghav.Patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(4);
        System.out.println();
        pattern6(4);
        System.out.println();
        pattern7(4);
        System.out.println();
        pattern8(4);
    }



    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row < 5; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row <= 2*n; row++) {
            int totalColsInRow = row>n ?2*n-row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a new line
            System.out.println();
        }
    }
    
    static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for(int spaces = n-totalColsInRow; spaces>0; spaces--){
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = n-row; spaces>0 ; spaces--){
                System.out.print("  ");
            }
            for (int col = row; col > 0 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        int originaln = n;
        n = 2*n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int valueToPrint = originaln + 1 - Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(valueToPrint+" ");
            }
            System.out.println();
        }
    }
}
