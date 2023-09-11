package com.seed;
public class CallByValue {
    //The parameters x and y in add method takes a and b.
    static int add(int x, int y)
    {
        {
            x += y;
            return x;
        }
    }
    public static void main(String[] args)
    {
        int a = 1, b = 2;
		CallByValue obj = new CallByValue();
		
        obj.add(a, b);
        //Th addition of two values is done using the sum function and the values of a does not change.
        System.out.println("After the add function a = "+ a);
        System.out.println("After the add function b = "+ b);
    }
}