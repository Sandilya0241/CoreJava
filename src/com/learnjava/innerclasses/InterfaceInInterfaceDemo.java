package com.learnjava.innerclasses;


interface Outer {
	public void m1();
	interface Inner {
		public void m2();		
	}
}

class OuterImplementation implements Outer {
	public void m1() {
		System.out.println("Outer interface implementation method");
	}
}
class InnerImplementation implements Outer.Inner {
	public void m2() {
		System.out.println("Inner interface implementation method");
	}
}
public class InterfaceInInterfaceDemo {
	public static void main(String[] args) {
		OuterImplementation o = new OuterImplementation();
		o.m1();
		
		InnerImplementation i = new InnerImplementation();
		i.m2();
	}
}
