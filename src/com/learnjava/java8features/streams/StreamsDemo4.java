package com.learnjava.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo4 {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println("Unsorted data : " + marks);
		System.out.println("=================================================================================");
		List<Integer> sortedData = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Natural Sorting Order  with empty parameter inside sorted() function : " + sortedData);
		System.out.println("=================================================================================");
		sortedData = marks.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println("Default Natural Sorting Order  with compareTo inside sorted() function  : " + sortedData);
		System.out.println("=================================================================================");
		System.out.println("=================================================================================");
		sortedData = marks.stream().sorted((n1, n2) -> -n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println("Descending order : " + sortedData);
	}
}
