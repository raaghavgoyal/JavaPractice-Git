package com.raghav.functionsAndMethods;
//shadowing is the practice of using two variable with same name within the scope that
//overlaps.
public class Shadowing {
    static int x = 90;//this will be shadowed at line 13
    //we can only access static inside static block
    //we can not use object dependent things inside object independent things
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;
        //System.out.println(x);//scope begins when value is initialized
        x = 40;//the class variable at line 5 is shadowed by this
        System.out.println(x); // 40
        fun();
        }
    static void fun(){
        System.out.println(x);
    }
}
