package com.learnjava.innerclasses;

public class NestingClassesDemoClient {
	public static void main(String[] args) {
		AClass a = new AClass();
		AClass.BClass b = a.new BClass();
		AClass.BClass.CClass c = b.new CClass();
		c.m1();
	}
}
class AClass {
	class BClass {
		class CClass {
			public void m1() {
				System.out.println("Inner most class method");
			}
		}
	}
}