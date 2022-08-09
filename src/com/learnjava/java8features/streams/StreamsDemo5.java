package com.learnjava.java8features.streams;

import java.util.ArrayList;

public class StreamsDemo5 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(25);
		l.add(20);
		Integer min = l.stream().min((n1, n2) -> -n1.compareTo(n2)).get();
		System.out.println(l);
		System.out.println(min);
		
		Integer max = l.stream().max((n1, n2) -> -n1.compareTo(n2)).get();
		System.out.println(max);
		
	}
}
