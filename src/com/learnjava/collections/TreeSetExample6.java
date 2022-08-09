package com.learnjava.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator4 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();	// For StringBuffer kind of objects
		return s1.compareTo(s2);
	}
}

public class TreeSetExample6 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator4());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}
}
