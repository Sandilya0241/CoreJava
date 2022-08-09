package com.learnjava.java8features;

interface Left {
	default void m1() {
		System.out.println("Left interface m1 method");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right interface m1 method");
	}
}

public class DiamondProblmSolutionWIthDefaultInterf implements Left, Right{

	public static void main(String[] args) {
		DiamondProblmSolutionWIthDefaultInterf obj = new DiamondProblmSolutionWIthDefaultInterf();
		obj.m1();
	}

	public void m1() {
		Left.super.m1();		// To have Left Interface implementation have this line and comment below lines
		Right.super.m1();	// To have Right Interface implementation have this line and comment lines above and below
		System.out.println("Overridden implementation of all interfaces"); // To have our own Interface implementation have this line and comment lines all above
	}

}
