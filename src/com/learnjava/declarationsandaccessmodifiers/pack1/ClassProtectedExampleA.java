package com.learnjava.declarationsandaccessmodifiers.pack1;

public class ClassProtectedExampleA {
	protected void m1() {
		System.out.println("The most misunderstood modifier");
	}
}

class ChildClassProtectedExampleA extends ClassProtectedExampleA {
	public static void main(String[] args) {
		ClassProtectedExampleA a = new ClassProtectedExampleA();
		a.m1();
		
		ChildClassProtectedExampleA b = new ChildClassProtectedExampleA();
		b.m1();
		
		ClassProtectedExampleA c = new ChildClassProtectedExampleA();
		c.m1();
	}
}
