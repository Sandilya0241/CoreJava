package com.learnjava.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/*
 * 
 * 
 * */

public class StreamsDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		
		List<Integer> updatedMarks = marks.stream().map(m -> m + 5).collect(Collectors.toList());
		
		long failedStudents = marks.stream().filter(m->m<35).count();
//		System.out.println(updatedMarks);
//		System.out.println(failedStudents);
		System.out.println("List before sorting : " + marks);
		
		List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("List after sorting : " + sortedMarks);
	}

}
