package com.learnjava.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class SquaringWithLambdaExp {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("Square of 40 is : " + f.apply(40));
		System.out.println("Square of 50 is : " + f.apply(50));
		
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println("Is 4 an even number ? " + p.test(4));
		System.out.println("Is 5 an even number ? " + p.test(5));
		
	}
}
