//package com.code;

class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
	
	public void show()
        {
             System.out.println("In a nested class method");
        }
	
  }
}

public class SimpleInnerClass {
  public static void main(String[] args)
  {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
	myInner.show();
  }
}