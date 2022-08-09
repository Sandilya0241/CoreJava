package com.learnjava.collections;

import java.util.TreeSet;

public class TreeSetExample001 {

	public static void main(String[] args) {
//		TreeSet t = new TreeSet();
//		t.add("A");
//		t.add("a");
//		t.add("B");
//		t.add("Z");
//		t.add("L");
//		//t.add(new Integer(10));	// ClassCast Exception
//		System.out.println(t);
		
		TreeSet t = new TreeSet();
		
		t.add("a");
		t.add(null);
		//t.add(new Integer(10));	// ClassCast Exception
		System.out.println(t);

	}

}
