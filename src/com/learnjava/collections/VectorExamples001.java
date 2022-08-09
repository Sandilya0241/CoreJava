package com.learnjava.collections;

import java.util.Vector;

public class VectorExamples001 {
	public static void main(String[] args) {
		//default constructor
		Vector v1 = new Vector();
		System.out.println("Initial capacity: " + v1.capacity());
		for (int cnt = 0; cnt < 10; cnt++) {
			v1.addElement(cnt + 1);
		}
		System.out.println("Capacity after filling 10 elements: " + v1.capacity());
		v1.addElement("Hello world");
		System.out.println("Capacity after filling 11th element: " + v1.capacity());
		System.out.println("Contents in Vector: " + v1);
		
		// Initial capacity constructor
		System.out.println("Initial capacity constructor");
		Vector v3 = new Vector(16);
		System.out.println("Initial capacity: " + v3.capacity());
		for (int cnt = 0; cnt < 10; cnt++) {
			v3.addElement(cnt + 1);
		}
		System.out.println("Capacity after filling 10 elements: " + v3.capacity());
		v3.addElement("Hello world");
		System.out.println("Capacity after filling 11th element: " + v3.capacity());
		System.out.println("Contents in Vector: " + v3);
		
		
		// Initial + Incremental capacity constructor
		System.out.println("Initial + Incremental capacity constructor");
		Vector v2 = new Vector(10, 5);
		System.out.println("Initial capacity: " + v2.capacity());
		for (int cnt = 0; cnt < 10; cnt++) {
			v2.addElement(cnt + 1);
		}
		System.out.println("Capacity after filling 10 elements: " + v2.capacity());
		v2.addElement("Hello world");
		System.out.println("Capacity after filling 11th element: " + v2.capacity());
		System.out.println("Contents in Vector: " + v2);
	}
}
