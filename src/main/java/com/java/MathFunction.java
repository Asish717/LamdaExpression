package com.java;
/*This interface contains example of
Lamda expression demo for Math operations*/

@FunctionalInterface /*just to indicate that it's a
functional interface as it has single method*/
public interface MathFunction {
    int calculator(int x,int y);
    MathFunction add= Integer::sum;
    MathFunction sub=(x,y)->x-y;
    MathFunction multi=(x,y)->x*y;
    MathFunction div=(x,y)->x/y;
    static void main(String[] args) {
        System.out.println(add.calculator(4,2));
        System.out.println(sub.calculator(4,2));
        System.out.println(multi.calculator(4,2));
        System.out.println(div.calculator(4,2));
    }
}
