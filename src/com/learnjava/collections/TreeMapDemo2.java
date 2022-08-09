package com.learnjava.collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator8());
		t.put("ZZZ", 10);
		t.put("AAA", 20);
		t.put("XXX", 30);
		t.put("LLL", 40);
		System.out.println(t);
	}
}

class MyComparator8 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}


/*	Output
 * 	{ZZZ=10, XXX=30, LLL=40, AAA=20}

 */

