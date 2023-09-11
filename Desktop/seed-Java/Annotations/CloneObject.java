//package com.code;

class CloneObject implements Cloneable {

	// declare variables
	String name;
	int version;

	public static void main(String[] args) {

		// create an object of Main class
		CloneObject obj1 = new CloneObject();

		// initialize name and version using obj1
		obj1.name = "Java";
		obj1.version = 14;

		// print variable
		System.out.println(obj1.name); // Java
		System.out.println(obj1.version); // 14

		try {

			// create clone of obj1
			CloneObject obj2 = (CloneObject) obj1.clone();

			// print the variables using obj2
			System.out.println(obj2.name); // Java
			System.out.println(obj2.version); // 14
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}