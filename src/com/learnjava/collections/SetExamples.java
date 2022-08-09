package com.learnjava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("C");
		hs.add(10);
		hs.add("D");
		hs.add(null);
		System.out.println(hs.add("Z"));
		System.out.println(hs);
		System.out.println(hs.add("Z"));
		
		System.out.println("============================="
				+ "LinkedHashSet"
				+ "============================");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("B");
		lhs.add("C");
		lhs.add(10);
		lhs.add("D");
		lhs.add(null);
		System.out.println(lhs.add("Z"));
		System.out.println(lhs);
		System.out.println(lhs.add("Z"));
	}

}
