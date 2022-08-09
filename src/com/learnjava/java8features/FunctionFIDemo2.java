package com.learnjava.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionFIDemo2 {
	public static void main(String[] args) {
		Function<Integer, Integer> fDouble = i-> i * 2;
		Function<Integer, Integer> fCube = i-> i * i * i;
		System.out.println("andThen functionality check.");
		System.out.println(fDouble.andThen(fCube).apply(2));
		
		System.out.println("compose functionality check.");
		System.out.println(fDouble.compose(fCube).apply(2));
	}
}
