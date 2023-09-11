//package com.code; 

public class Gc {
	public void finalize() throws Throwable
	{
		System.out.println("Object is destroyed by the Garbage Collector");
	}
	public static void main(String[] args) {
	  
		Gc obj = new Gc();
		obj = null;
		System.gc();
	}
}