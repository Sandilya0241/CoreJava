package com.learnjava.generics;
import java.util.ArrayList;
public class GenericsLesson7 {	
	public static void main(String[] args) {
		ArrayList l = new ArrayList<String>();
		l.add(10);
		l.add(10.5);
		l.add(true);
		System.out.println(l);
	}
}

