package com.learnjava.collections;

import java.util.Arrays;
import java.util.List;

public class AsListDemo {

	public static void main(String[] args) {
		String[] s = {"A", "Z", "B"};
		List l = Arrays.asList(s);
		System.out.println(l);
		s[0] = "N";
		System.out.println(l);
		l.set(1, "S");
		for (String s1 : s)
			System.out.println(s1);
		/*
		 * Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.AbstractList.add(AbstractList.java:153)
        at java.base/java.util.AbstractList.add(AbstractList.java:111)
        at com.learnjava.collections.AsListDemo.main(AsListDemo.java:15)
		 */
		//l.add("M"); //UnsupportedOperationException
		/*
		 * Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.AbstractList.remove(AbstractList.java:167)
        at com.learnjava.collections.AsListDemo.main(AsListDemo.java:22)
		 */
		//l.remove(2);	//UnsupportedOperationException
		/*
		 * Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
        at java.base/java.util.Arrays$ArrayList.set(Arrays.java:4170)
        at com.learnjava.collections.AsListDemo.main(AsListDemo.java:28)
		 */
		//l.set(1, new Integer(10));//ArrayStoreException
	}
}

/*
 * Output
 * [A, Z, B]
	[N, Z, B]
	N
	S
	B
 */