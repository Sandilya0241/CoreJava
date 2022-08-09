package com.learnjava.java8features;

public class MethodRefDemo2 {

	private int m1() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println("m1 Thread");
		}
		return 19;
	}
	public static void main(String[] args) {

		// In case of method reference different return types are allowed.
		// But only restriction is argument types must be matched.
		
		
		// For Instance methods
		MethodRefDemo2 m = new MethodRefDemo2();
		Runnable r = m::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
