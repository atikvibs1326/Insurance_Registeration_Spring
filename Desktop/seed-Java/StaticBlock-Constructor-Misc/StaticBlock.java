package com.seed;
class StaticBlock{
   static int val_1;
   
   int val_2;   
   
   static{
      val_1 = 67;
      System.out.println("The static block has been called.");      
      System.out.println(val_1);
   }
   

   
   public static void main(String args[])
   {
	   System.out.println("In main method");
   }
}