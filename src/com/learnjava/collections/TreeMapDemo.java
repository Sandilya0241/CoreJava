package com.learnjava.collections;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
//		t.put("FFFF", "XXX");	// Line A
		t.put(null, "XXX");		// Line B
		System.out.println(t);
	}
}

/*	Output
 * 	{100=ZZZ, 101=XXX, 103=YYY, 104=106}
 * 	
 * 
 * 	But if Line A is uncommented, output is
 *  Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        at java.base/java.lang.String.compareTo(String.java:134)
        at java.base/java.util.TreeMap.put(TreeMap.java:566)
        at com.learnjava.collections.TreeMapDemo.main(TreeMapDemo.java:12)
 *
 *
 *	But if Line B is uncommented, output is
 *	Exception in thread "main" java.lang.NullPointerException
        at java.base/java.util.TreeMap.put(TreeMap.java:561)
        at com.learnjava.collections.TreeMapDemo.main(TreeMapDemo.java:13)	
 */