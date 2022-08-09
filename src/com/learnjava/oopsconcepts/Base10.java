package com.learnjava.oopsconcepts;

class Base10 {
	int i = 10;
	{
		m1();
		System.out.println("Base Instance Block");
	}
	Base10() {
		System.out.println("Base Constructor");
	}
	public static void main(String[] args) {
		Base10 b = new Base10();
		System.out.println("Base Main Method");
	}
	public void m1() {
		System.out.println(j);
	}
	int j = 20;
}

class Derived10 extends Base10 {
	int x = 100;
	{
		m2();
		System.out.println("Derived First Instance Block");
	}
	Derived10() {
		System.out.println("Derived Constructor");
	}
	public static void main(String[] args) {
		Derived10 d = new Derived10();
		System.out.println("Derived Main Method");
	}
	public void m2() {
		System.out.println(y);
	}
	{
		System.out.println("Derived Second Instance Block");
	}
	int y = 200;
}
