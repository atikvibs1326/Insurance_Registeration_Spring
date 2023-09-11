package com.seed;

class ArrayAsMethodParameter {
	void function1(int[] array) {
		System.out.println("The first element is: " + array[0]);
	}
	public static void main(String[] args) {
		
		ArrayAsMethodParameter obj = new ArrayAsMethodParameter();

		int[] oneDimensionalArray = { 1, 2, 3, 4, 5 };

		obj.function1(oneDimensionalArray);
	}
}
