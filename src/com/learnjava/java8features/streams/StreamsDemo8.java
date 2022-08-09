package com.learnjava.java8features.streams;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsDemo8 {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		s.forEach(System.out::println);
		
		
		Integer[] i = {10, 0, 20, 5, 15};
		Stream.of(i).forEach(System.out::println);
	}
}

