package com.learnjava.oopsconcepts;

public class OOPSConceptsLesson09 {
	public static void main(String[] args) {
		System.out.println(A.i);
	}
}

class A {
	static int i = B.j;
}

class B {
	static int j = C8.k;
}

class C8 {
	static int k = D.m1();
}

class D {
	static int m1() {
		return 10;
	}
}