package com.learnjava.java8features.streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamsDemo6 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(25);
		l.add(20);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		
		Consumer<Integer> cSquare = n -> {
			System.out.println("The square is : " + n * n);
		}; 
		l.stream().forEach(cSquare);
	}
}

