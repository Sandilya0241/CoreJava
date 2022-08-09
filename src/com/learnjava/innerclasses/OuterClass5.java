package com.learnjava.innerclasses;
public class OuterClass5 {
	public class InnerClass5 {
		public void m1() {
			System.out.println("M1 method");
		}
	}
	public void m1() {
		InnerClass5 i = new InnerClass5();
		i.m1();
	}
	public static void main(String[] args) {
		OuterClass5 o = new OuterClass5();
		o.m1();
	}
}
