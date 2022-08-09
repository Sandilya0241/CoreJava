package com.learnjava.innerclasses;
public class OuterClass7 {
	int x = 10;
	static int y = 20;
	public class InnerClass7 {
		public void m1() {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
		}
	}	
	public static void main(String[] args) {
		new OuterClass7().new InnerClass7().m1();
	}
}