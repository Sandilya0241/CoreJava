package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson06 {
	public static void main(String[] args) {
		Parent4 p = new Parent4();
		p.m1();
		
		Child4 c = new Child4();
		c.m1();
		
		Parent4 p1 = new Child4();
		p1.m1();
		
		p.m2();
		c.m2();
		p1.m2();
	}
}

class Parent4 {
	public void m1() {
		System.out.println("Parent m1 method");
	}
	public static void m2() {
		System.out.println("Parent m2 method");
	}
}

class Child4 extends Parent4 {
	public void m1() {
		System.out.println("Child m1 method");
	}
	public static void m2() {
		System.out.println("Child m2 method");
	}
}