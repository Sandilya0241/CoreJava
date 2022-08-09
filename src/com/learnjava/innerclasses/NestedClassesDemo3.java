package com.learnjava.innerclasses;
public class NestedClassesDemo3 {
	int x = 10;
	static int y = 20;
	static class NestedClass3 {
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
}
