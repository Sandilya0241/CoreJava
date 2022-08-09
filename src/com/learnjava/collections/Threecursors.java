package com.learnjava.collections;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Threecursors {
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * Enumeration
		 * 
		 */
		System.out.println("=============================================="
				+ "Enumeration"
				+ "============================================");
		
		
		Vector v = new Vector();
		for (int cnt = 0; cnt <= 10; cnt++) {
			v.addElement(cnt);
		}
		
		System.out.println(v);
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer I = (Integer) e.nextElement();
			if (I % 2 == 0) {
				System.out.println(I);
			}
		}
		System.out.println(v);
		
		System.out.println("=============================================="
				+ "Iterator"
				+ "============================================");
		
		ArrayList al = new ArrayList();
		for (int cnt = 0; cnt <= 10; cnt ++) {
			al.add(cnt);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if(I % 2 == 0) {
				System.out.println(I);
			} else {
				itr.remove();
			}
		}
		System.out.println(al);
		
		System.out.println("=============================================="
				+ "ListIterator"
				+ "============================================");
		
		LinkedList ll = new LinkedList();
		ll.add("Balakrishna");
		ll.add("Venky");
		ll.add("Chiru");
		ll.add("Nag");
		System.out.println(ll);	// [Balakrishna, Venky, Chiru, Nag]
		ListIterator lItr = ll.listIterator();
		
		while(lItr.hasNext()) {
			String str = (String) lItr.next();
			if(str == "Venky") {
				lItr.remove(); // [Balakrishna, Chiru, Nag]
			} else if (str == "Chiru") {
				lItr.set("Charan"); // [Balakrishna, Charan, Nag]
			} else if (str == "Nag") {
				lItr.add("Chaitu"); // [Balakrishna, Charan, Nag, Chaitu]
			}
		}
		System.out.println(ll); // [Balakrishna, Charan, Nag, Chaitu]
		
		
		System.out.println("=============================================="
				+ "Internal implementation of Cursors"
				+ "============================================");
		
		Vector v1 =  new Vector();
		Enumeration e1 = v1.elements();
		Iterator itr1 = v1.iterator();
		ListIterator lItr1 = v.listIterator();
		System.out.println(e1.getClass().getName());
		System.out.println(itr1.getClass().getName());
		System.out.println(lItr1.getClass().getName());
		
	}
}
