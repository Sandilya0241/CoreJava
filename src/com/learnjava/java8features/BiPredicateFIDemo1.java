package com.learnjava.java8features;

import java.util.function.BiPredicate;

public class BiPredicateFIDemo1 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPEven = (i,  j) -> (i + j) % 2 == 0;
		System.out.println(biPEven.test(10, 20));
		System.out.println(biPEven.test(15, 20));
	}
}
