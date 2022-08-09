package com.learnjava.java8features.streams;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsDemo7 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(25);
		l.add(20);
		Integer[] i = l.stream().toArray(Integer[]::new );
		for(Integer iTemp : i) {
			System.out.println(iTemp);
		}
		
		Stream.of(i).forEach(System.out::println);
	}
}

