package com.learnjava.innerclasses;
public class OuterClass11 {
	int x = 10;
	static int y = 100;
	public void m1() {
		class InnerClass11 {
			public void m2() {
				System.out.println("x : " + x);
				System.out.println("y : " + y);
			}
		}
		new InnerClass11().m2();
	}
	public static void main(String[] args) {
		new OuterClass11().m1();
	}
}