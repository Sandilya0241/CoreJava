package com.learnjava.java8features;

@FunctionalInterface
interface interf5 {
	public void add(int num1, int num2);
}

public class MethodRefDemo4 {

	public static void m1(int x, int y) {
		System.out.println("The Sum value is : " + (x + y));
	}
	public static void main(String[] args) {

		interf5 ir = MethodRefDemo4::m1;
		ir.add(10, 20);
		
		interf5 ir2 = (a,b) -> System.out.println("The Sum value is : " + (a + b));
		ir2.add(200, 100);
		
	}

}
