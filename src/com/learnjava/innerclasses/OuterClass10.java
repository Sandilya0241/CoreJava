package com.learnjava.innerclasses;
public class OuterClass10 {
	int x = 10;
	static int y = 100;
	public static void m1() {
		class InnerClass10 {
			public void m2() {
				System.out.println("x : " + x);
				System.out.println("y : " + y);
			}
		}
	}
	public static void main(String[] args) {
		new OuterClass10().m1();
	}
}