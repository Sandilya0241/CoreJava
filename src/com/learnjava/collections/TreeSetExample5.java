package com.learnjava.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator3 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = o2.toString();	// For StringBuffer kind of objects
		//return s2.compareTo(s1);
		return -s1.compareTo(s2);
	}
}

public class TreeSetExample5 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator3());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}
