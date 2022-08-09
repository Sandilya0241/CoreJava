package com.learnjava.java8features;

public interface Interface8Demo2 {
	default void m1() {	
		System.out.println("Default Method");
	}
	
	default int hashCode() {
		return 10;
	}
}

class Interface8Demo2Impl1 implements Interface8Demo2{
	public void m1() {
	}
	public void m2() {
	}
}
