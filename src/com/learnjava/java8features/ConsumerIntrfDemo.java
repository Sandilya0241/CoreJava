package com.learnjava.java8features;

import java.util.function.Consumer;

public class ConsumerIntrfDemo {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello, Functional Interfaces");
		c.accept("Hello, Functional Interfaces ... 2");
	}

}
