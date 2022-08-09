package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson02 {
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.5);
	}
}

class Test {
	
	public void m1() {
		System.out.println("No-args method");
	}
	
	public void m1(int i) {
		System.out.println("Int arg method");
	}
	
	public void m1(double d) {
		System.out.println("double arg method");
	}
}
