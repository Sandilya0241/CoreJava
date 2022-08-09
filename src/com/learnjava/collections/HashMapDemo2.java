package com.learnjava.collections;

import java.util.HashMap;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "Pavan");
		m.put(i2, "Kalyan");
		System.out.println(m);
	}
}
