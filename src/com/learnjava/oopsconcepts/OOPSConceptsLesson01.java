package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson01 {
	public static void main(String[] args) {
		P p = new P();
		p.m1();
		//p.m2();	// Cannot find symbol. symbol : method m2(), location : class P
		
		C c = new C();
		c.m1();
		c.m2();
		
		P p1 = new C();
		p1.m1();
		//p1.m2();	// Cannot find symbol. symbol : method m2(), location : class P
		
		//C c1 = new P();	// Incompatible types. found : P, Required : C
	}
}

class P {
	
	public void m1() {
		System.out.println("Parent m1 method");
	}
}

class C extends P {
	
	public void m2() {
		System.out.println("Child m2 method");
	}
}
