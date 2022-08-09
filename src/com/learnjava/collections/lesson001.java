/*ArrayList*/
package com.learnjava.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class lesson001 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"M");
		l.add("N");
		System.out.println(l);
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
		
		ArrayList l3 = new ArrayList();
		List l4 /*Synchronized*/ = Collections.synchronizedList(l3)/*UnSynchronized*/;
	}
}
