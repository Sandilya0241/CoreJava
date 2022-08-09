package com.learnjava.exceptionlessons;

public class ExceptionClass103 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Method 1: ExceptionName + Description + Stacktrace");
			System.out.println("---------------------------------------------------------");
			e.printStackTrace();
			System.out.println("---------------------------------------------------------");
			System.out.println("Method 2: ExceptionName + Description");
			System.out.println("---------------------------------------------------------");
			System.out.println("Printing object (internally toString() method call)" + e);
			System.out.println("Printing object (explicit toString() call)" + e.toString());
			System.out.println("---------------------------------------------------------");
			System.out.println("Method 3: Description");
			System.out.println("---------------------------------------------------------");
			System.out.println(e.getMessage());
		}
	}
}
