package com.learnjava.java8features;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		
		String [] str = {"Nag", "Chiranjeevi", "Venkatesh", "Balaiah", "Sunny", "Katrina"};
		Predicate<String> p = s -> s.length() > 5;
		for (String s1 : str) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
	}

}
