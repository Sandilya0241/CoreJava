package com.learnjava.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		int[] a = {10, 5, 20, 11, 6};
		Arrays.sort(a);
		System.out.println("Searching for 6:" + Arrays.binarySearch(a, 6));
		System.out.println("Searching for 14:" + Arrays.binarySearch(a, 14));

		String[] s = {"A", "Z", "B", "M"};
		Arrays.sort(s);
		System.out.println("Searching for Z:" + Arrays.binarySearch(s, "Z"));
		System.out.println("Searching for S:" + Arrays.binarySearch(s, "S"));

		Arrays.sort(s, new MyComparator23());
		System.out.println("Searching for Z:" + Arrays.binarySearch(s, "Z", new MyComparator23()));
		System.out.println("Searching for S:" + Arrays.binarySearch(s, "S", new MyComparator23()));
		System.out.println("Searching for N without Comparator:" + Arrays.binarySearch(s, "M"));
		for (String sTemp : s)
			System.out.println(sTemp);
	}															
}

class MyComparator23 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}