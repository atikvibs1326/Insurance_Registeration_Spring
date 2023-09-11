package com.seed;
class ToStringExample{  
 int rollno;  
 String name;  
 String city;  
  
 ToStringExample(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   ToStringExample s1=new ToStringExample(101,"Raj","Pune");  
   ToStringExample s2=new ToStringExample(102,"Vijay","Ahmednagar");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
} 