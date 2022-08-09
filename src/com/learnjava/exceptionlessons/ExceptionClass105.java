package com.learnjava.exceptionlessons;

public class ExceptionClass105 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		throw new ArithmeticException("/ by zero");
//		System.out.println(10/0);
	}
}