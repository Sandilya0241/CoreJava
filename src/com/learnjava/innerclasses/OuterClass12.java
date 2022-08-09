package com.learnjava.innerclasses;
public class OuterClass12 {
	public void m1() {
		int x = 10;
		class InnerClass12 {
			public void m2() {
				System.out.println("x : " + x);
			}
		}
		InnerClass12 i = new InnerClass12();
		i.m2();
	}
	public static void main(String[] args) {
		OuterClass12 o = new OuterClass12();
		o.m1();
	}
}
