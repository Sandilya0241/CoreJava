package com.learnjava.java8features;

public class MethodRefDemo {

	public void m1() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println("m1 Thread");
		}
	}
	
	public static void m2() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println("m2 Thread");
		}
	}
	
	public static void main(String[] args) {
		// Code Reusability
// Here Run method is referring m1/ m2 method
// For Static methods
//		Runnable r = MethodRefDemo::m2;
//		Thread t = new Thread(r);

		
// For Instance methods
		MethodRefDemo m = new MethodRefDemo();
		Runnable r = m::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
