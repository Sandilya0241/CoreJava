package com.learnjava.oopsconcepts;

class OOPSConceptsLesson16 {
	int i = 10;
	{
		m1();
		System.out.println("First Instance Block");
	}
	OOPSConceptsLesson16() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		OOPSConceptsLesson16 o = new OOPSConceptsLesson16();
		System.out.println("Main Method");
	}
	public void m1() {
		System.out.println(j);
	}
	{
		System.out.println("Second Instance Block");
	}
	int j = 30;
}
