package com.learnjava.java8features;

public interface Interface8Demo {
	public void m1();
	public void m2();
	default void m3() {	
	}
}

class Interface8DemoImpl1 implements Interface8Demo{
	public void m1() {
	}
	public void m2() {
	}
}

class Interface8DemoImpl2 implements Interface8Demo{
	public void m1() {
	}
	public void m2() {
	}
}

class Interface8DemoImpln implements Interface8Demo{
	public void m1() {
	}
	public void m2() {
	}
}