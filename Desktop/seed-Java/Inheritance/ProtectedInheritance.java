//package com.code;
class Num //super class 
 { 
       protected int x,y; //protected Members 
       
	   Num(int a, int b) 
       { 
        x=a; 
        y=b; 
       } 
       
	   public void showxY() 
       { 
      
         System.out.println("x = " + x); 
         System.out.println("y = " + y); 
        }
		
 }
 
class Result extends Num 
{ 
       private int z ; 
       
	   Result(int a,int b) 
       { 
         super(a,b); 
       } 
       
	   public void add() 
       {    
         z = x+y; 
       } 
       
	   public void show() 
       { 
        System.out.println("z = " + z); 
       } 
	   
} 

public class ProtectedInheritance 
     { 
         public static void main(String[] args) 
        { 
            Result d = new Result(5,6); 
            d.showxY(); 
            d.add(); 
            d.show(); 
        } 
    } 