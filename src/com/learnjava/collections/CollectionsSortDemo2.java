package com.learnjava.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CollectionsSortDemo2 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		//l.add(new Integer(10));	// ClassCastException
		//l.add(null);            // NullPointerException
		System.out.println("Before sorting : " + l);
		Collections.sort(l, new MyComparator20());
		System.out.println("After sorting : " + l);
	}
}

class MyComparator20 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
/*
 * Output:
 * 	Before sorting : [Z, A, K, L]
 *  After sorting : [Z, L, K, A]
 * 
 * 
 */
