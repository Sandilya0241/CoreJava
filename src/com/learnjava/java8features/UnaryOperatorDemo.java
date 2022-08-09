package com.learnjava.java8features;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<Integer> fSqr = i -> i * i;
		System.out.println(fSqr.apply(6));
		
		IntUnaryOperator fSqr1 = i -> i * i;
		System.out.println(fSqr1.applyAsInt(7));
	}

}
