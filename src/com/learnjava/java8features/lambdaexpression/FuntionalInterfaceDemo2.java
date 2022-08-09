package com.learnjava.java8features.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.util.stream.*;

public class FuntionalInterfaceDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(25);
		al.add(5);
		al.add(30);
		al.add(0);
		al.add(15);
		System.out.println(al);
		Comparator<Integer> c = (a,b) -> (a > b) ? 1 : (a < b) ? -1 : 0;
		Collections.sort(al, c);
		System.out.println(al);
		al.stream().forEach(System.out::println);
		List<Integer> l2 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
