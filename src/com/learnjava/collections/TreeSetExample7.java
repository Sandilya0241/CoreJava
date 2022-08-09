package com.learnjava.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator5 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		if(s1.length() > s2.length()) {
			return 1;
		} else if(s1.length() < s2.length()) {
			return -1;
		} else {
			return s1.compareTo(s2);
		}
	}
}

public class TreeSetExample7 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator5());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}
}

/*	Output
 * 	[A, AA, XX, ABC, ABCD]
 * 
 */