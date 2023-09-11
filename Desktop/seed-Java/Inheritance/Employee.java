//package com.code;
class Employee
{
  int emp_id;
  String emp_name;
  MyDate date;   //MyDate is a class having date, month and year

  Employee(int id, String name, MyDate d)
  {
    emp_id=id;
    emp_name=name;
    date=d;
  }
  
  public void display()
  {
	  System.out.println(" emp_id: " + emp_id);
	  System.out.println(" emp_name: " + emp_name);
	  System.out.println(" date year: " + date.year);
	  System.out.println(" date month: " + date.month);
	  System.out.println(" date day: " + date.day);
  }

public static void main(String args[])
{
  
  Employee e = new Employee(123,"java", new MyDate(23,5,2012));
  
  e.display();

}
}