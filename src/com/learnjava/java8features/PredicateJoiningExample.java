package com.learnjava.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;


public class PredicateJoiningExample {

	public static void main(String[] args) {
		
		int[] iArr = {0, 5, 10, 15, 20, 25, 30, 35};
		Predicate<Integer> pEven = num -> num % 2 == 0;
		Predicate<Integer> pMoreThan10 = num -> num > 10;
		System.out.println("Printing numbers greater than 10 and even...");
		
		for (int i : iArr) {
			if (pEven.and(pMoreThan10).test(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println("Printing numbers greater than 10 or even...");
		
		for (int i : iArr) {
			if (pEven.or(pMoreThan10).test(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println("Printing numbers which are not even...");
		
		for (int i : iArr) {
			if (pEven.negate().test(i)) {
				System.out.println(i);
			}
		}
		
	}

}
