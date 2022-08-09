package com.learnjava.java8features;


class Sample {
	Sample() {
		System.out.println("Called no-arg constructor of Sample class");
	}
}

@FunctionalInterface
interface interf6 {
	public Sample get();
}

public class ConstructorRefDemo {
	public static void main(String[] args) {
		// Get method is referring Sample class Constructor
		
		interf6 i = Sample::new;
		i.get();
		i.get();
		i.get();
		i.get();
	}
}
