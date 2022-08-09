package com.learnjava.java8features;


class Sample2 {
	Sample2() {
		System.out.println("Called no-arg constructor of Sample class");
	}
	Sample2(String s) {
		System.out.println("Called constructor of Sample class with args : " + s);
	}
}

@FunctionalInterface
interface interf7 {
	public Sample2 get(String s);
}

public class ConstructorRefDemo2 {
	public static void main(String[] args) {
		// Get method is referring Sample class Constructor
		
		interf7 i = Sample2::new;
		i.get("Sandy");
		
	}
}
