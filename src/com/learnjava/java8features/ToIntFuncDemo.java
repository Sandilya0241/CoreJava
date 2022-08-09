package com.learnjava.java8features;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class ToIntFuncDemo {

	public static void main(String[] args) {
		ToIntFunction<String> lenFun = s -> s.length();
		System.out.println(lenFun.applyAsInt("Sandy"));

		IntToDoubleFunction sqrtFunc = i -> Math.sqrt(i);
		System.out.println(sqrtFunc.applyAsDouble(9));
	}

}
