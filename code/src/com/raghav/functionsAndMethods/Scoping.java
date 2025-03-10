package com.raghav.functionsAndMethods;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //whatever is declared in the parent section(before the child block),
        //can be accessed in the child block.
        {
            //whatever is declared inside the block can not be accessed outside
            //int a = 99;//already initalized outside the block in the same method
            //hence you can not initalize again
            int c = 78;
            //values initialized in this block, will remain in block
        }
        //System.out.println(c);//cannot use outside the block


        //scoping in for loop
        for (int i = 0 ; i< 5; i++){
            System.out.println(i);
            int num = 90;
            //int a = 10;//same reason as above

        }
        //System.out.println(i);// i is also treated as inside the loop block
    }
    static void random(int marks){
        int num = 76;
        System.out.println(marks);
        System.out.println(num);
    }
}
