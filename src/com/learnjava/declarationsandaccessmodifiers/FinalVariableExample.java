package com.learnjava.declarationsandaccessmodifiers;

public class FinalVariableExample {
	int x;
	final int y1;
	final int y;
	final int z = 20;
	static int b;
	final static int COUNT_OF_DAYS_IN_WEEK;
	{
		y = 10;
	}
	static {
		COUNT_OF_DAYS_IN_WEEK = 7;
	}
	FinalVariableExample() {
		y1 = 50;
	}
	public void m1() {
		
//		y1 = 50;
//		COUNT_OF_DAYS_IN_WEEK = 7;
	}
	public static void main(String[] args) {
		System.out.println(b);
	}
}
