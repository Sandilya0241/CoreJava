package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson07 {
	public static void main(String[] args) {
		Parent6 p = new Parent6();
		p.m1(10);
		
		Child6 c = new Child6();
		c.m1(10);
		
		Parent6 p1 = new Child6();
		p1.m1(10);
	}
}

class Parent6 {
	public void m1(int... i) {
		System.out.println("Parent method");
	}
}

class Child6 extends Parent6{
	public void m1(int i) {
		System.out.println("Child method");
	}
}
