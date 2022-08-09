package com.learnjava.innerclasses;

public class NestedClassesDemo1 {
	static class NestedClass{
		public void m1() {
			System.out.println("Static Nested class");
		}
	}
	public static void main(String[] args) {
		NestedClass n = new NestedClass();
		n.m1();
	}
}
