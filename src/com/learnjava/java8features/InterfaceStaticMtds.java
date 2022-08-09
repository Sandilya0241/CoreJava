package com.learnjava.java8features;

interface Interf {
	public static void m1() {
		System.out.println("Interface static method");
	}
}

public class InterfaceStaticMtds implements Interf{
	public static void main(String[] args) {
		Interf.m1();					// Valid. 
		//m1();							// Invalid. Interface static methods by default not available to implementation class. So, invalid way to call m1 method
		//Test.m1();						// Invalid. Interface static methods by default not available to implementation class. So, invalid way to call m1 method
		Test t = new Test();
		//t.m1();							// Invalid. Interface static methods by default not available to implementation class. So, invalid way to call m1 method
	}
}
