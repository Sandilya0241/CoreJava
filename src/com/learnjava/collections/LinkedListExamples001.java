package com.learnjava.collections;

import java.util.LinkedList;

public class LinkedListExamples001 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Durga");
		ll.add(30);
		ll.add(null);
		ll.add("Durga");
		System.out.println(ll);
		ll.set(0, "Software");
		System.out.println(ll);
		ll.add(0,"Milk shake");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("Ice Tea");
		System.out.println(ll);
	}
}
