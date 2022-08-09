package com.learnjava.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo3 {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println("Unsorted data : " + marks);
		List<Integer> sortedData = marks.stream().sorted((n1, n2) -> n1 > n2 ? -1 : ( n2 > n1) ? 1 : 0).collect(Collectors.toList());
		System.out.println("Sorted data in descending order (Customized sorting - Comparator) : " + sortedData);
	}
}
