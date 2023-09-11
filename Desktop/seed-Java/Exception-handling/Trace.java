//package com.code;

public class Trace {
   public static void main(String args[]) throws Throwable {
      try {
         int n = 3;
         System.out.println(n/0);
      } catch (ArithmeticException e) {
         System.out.println(e.getMessage());
         e.printStackTrace(); // prints the stack trace
      }
   }
}