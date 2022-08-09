package com.learnjava.declarationsandaccessmodifiers;

public class FinalVariableExample01 {

	
	public static void main(String[] args) {
//		public int x = 10;
//		private int x = 10;
//		protected int x = 10;
//		static int x = 10;
//		transient int x = 10;
//		volatile int x = 10;
//		
		final int x = 10;
		System.out.println(x); 
		m1(10, 20);
	}
	public static void m1(final int x, int y) {
//		x = 100;
		y = 200;
		System.out.println(x + "..." + y);
	}
}
