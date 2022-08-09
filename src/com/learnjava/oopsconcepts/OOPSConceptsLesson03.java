package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson03 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marriage();
		
		Child c = new Child();
		c.marriage();
		
		Parent p1 = new Child();
		p1.marriage();
	}
}

class Parent {
	
	public void property() {
		System.out.println("Gold + Cash + Land");
	}
	public void marriage() {
		System.out.println("Parent marriage method");
	}
}

class Child extends Parent {
	
	public void marriage() {
		System.out.println("Child marriage method");
	}
}

class Parent2 {
	
	public void m1() {
		
	}
}

class Child2 extends Parent2{
	
//	void m1() {	
//	}
}