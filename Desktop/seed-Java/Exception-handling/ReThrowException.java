//package com.code;

//re-throw an exception we caught
public class ReThrowException {

	public static void main(String[] args) {
		System.out.println("main begin");
		try {

			processName();
		} catch (Exception e) {
			System.out.println("Unable to Process Name !!!");
		}
		System.out.println("main end");
	}

	public static void processName() {
		String firstName = "Sekhar";
		String lastName = null;

		try {
			fullName(firstName, lastName);
		} catch (Exception e) {
			// Here we are logging exception before rethrow
			// logger.error("unable to evaluate fullname", e);
			throw e;
			// rethrowing same exception we caught
		}
	}

	public static String fullName(String firstName, String lastName) {
		System.out.println("processing fullName  ...");
		return lastName.concat(firstName);
	}
}
