package com.learnjava.collections;

import java.util.TreeSet;

public class TreeSetExample002 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		System.out.println(t);
		
		
		System.out.println("=================================="
				+ "COMPARABLE");
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(null)); Null pointer exception
	}
}
