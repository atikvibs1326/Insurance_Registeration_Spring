//package com.code;  
class ParentClass   
{  
    /* Constructor */     
    ParentClass()  
    {  
        System.out.println("ParentClass constructor executed.");  
    }  
}  
  
class ChildClass extends ParentClass   
{  
    /* Constructor */  
    ChildClass()  
    {  
        System.out.println("ChildClass constructor executed.");  
    }  
}  
  
public class ConstructorInInheritance  
{  
     
    public static void main(String ar[])   
    {  
        /* Create instance of ChildClass */  
        System.out.println("Order of constructor execution...");  
        new ChildClass();     
    }  
}  