//package com.code;

class MyException extends Exception {
	public MyException(String s) {		
		super(s);
	}
}

//A Class that uses above MyException
public class CustomException {
	// Driver Program
	
	public static void main(String args[]) {
		try {
			
			throw new MyException("Seed");
		} catch (MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
