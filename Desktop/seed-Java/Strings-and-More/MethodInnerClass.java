//package com.code;

public class MethodInnerClass 
{ 

   public void display()
  { 
 
    class InnerClass 
    { 
       public void msg(){ 
        System.out.println("I am in Local inner class"); 
       } 
     } 
    InnerClass ic = new InnerClass(); 
       ic.msg(); 
  } 
public static void main(String[] args) 
{ 
 
     MethodInnerClass oc = new MethodInnerClass(); 
       oc.display(); 
   } 
}