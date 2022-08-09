package com.learnjava.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int[] a = {10, 5, 20, 11, 6};
		System.out.println("Primitive array before sorting:");
		for (int a1 : a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Primitive array after sorting:");
		for (int a1 : a) {
			System.out.println(a1);
		}
		
		String[] s = {"A", "Z", "B"};
		System.out.println("Object array before sorting:");
		for (String sItem : s) {
			System.out.println(sItem);
		}
		Arrays.sort(s);
		System.out.println("Object array after sorting:");
		for (String sItem : s) {
			System.out.println(sItem);
		}
		
		Arrays.sort(s, new MyComparator22());
		System.out.println("Object array after sorting with Comparator:");
		for (String sItem : s) {
			System.out.println(sItem);
		}
	}
}

class MyComparator22 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}