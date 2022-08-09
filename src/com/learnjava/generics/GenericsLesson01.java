package com.learnjava.generics;

import java.util.ArrayList;

public class GenericsLesson01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Sandy");
		al.add(new Integer(10));
		System.out.println((String)al.get(0));
		System.out.println((String)al.get(1));
	}
}
