package com.learnjava.collections;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsSortDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));	// ClassCastException
		//l.add(null);            // NullPointerException
		System.out.println("Before sorting : " + l);
		Collections.sort(l);
		System.out.println("After sorting : " + l);
	}
}

/*
 * Output:
 * 	Before sorting : [Z, A, K, N]
 *	After sorting : [A, K, N, Z]
 * 
 * 
 */
