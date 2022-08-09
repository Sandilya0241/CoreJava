package com.learnjava.java8features;

import java.util.function.IntPredicate;

public class IntPredicateDemo1 {
	public static void main(String[] args) {
		int [] x = {0, 5, 10, 15, 20, 25, 30, 35, 40};
		IntPredicate ip = i -> i % 2 == 0;
		for (int tmp : x) {
			if(ip.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
}
