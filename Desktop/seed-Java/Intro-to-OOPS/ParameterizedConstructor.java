//package com.code; 
class ParameterizedConstructor{  
    int id;  
    String name; 
	
    //creating a parameterized constructor  
    ParameterizedConstructor(int i,String n)
	{  
		id = i;  
		name = n;  
    }
	
    //method to display the values  
    void display()
	{
		System.out.println(id+" "+name);
	}  
   
    public static void main(String args[])
	{  
		//creating objects and passing values  
		ParameterizedConstructor obj1 = new ParameterizedConstructor(111,"Karan");  
		ParameterizedConstructor obj2 = new ParameterizedConstructor(222,"Aryan");  
		
		//calling method to display the values of object  
		obj1.display();  
		obj2.display();  
   }  
}  