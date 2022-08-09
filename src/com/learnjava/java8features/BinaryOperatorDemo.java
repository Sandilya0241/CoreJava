package com.learnjava.java8features;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> bOpMul = (i1, i2) -> i1 * i2;
		System.out.println(bOpMul.apply(10, 20));
		
		IntBinaryOperator intBOpMul = (i1, i2) -> i1 * i2;
		System.out.println(intBOpMul.applyAsInt(10, 20));
	}
}
