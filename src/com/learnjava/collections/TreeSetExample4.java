package com.learnjava.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator2 implements Comparator {
	String method;
	MyComparator2(String methodName) {
		this.method = methodName;
	}
	
	public int compare(Object o1, Object o2) {
		
		if(method.equals("Method1")) {
			Integer I1 = (Integer)o1;
			Integer I2 = (Integer)o2;
			return I1.compareTo(I2);
		} else if(method.equals("Method2")) {
			Integer I1 = (Integer)o1;
			Integer I2 = (Integer)o2;
			return -I1.compareTo(I2);
		}  else if(method.equals("Method3")) {
			Integer I1 = (Integer)o1;
			Integer I2 = (Integer)o2;
			return I2.compareTo(I1);
		} else if(method.equals("Method4")) {
			Integer I1 = (Integer)o1;
			Integer I2 = (Integer)o2;
			return -I2.compareTo(I1);
		} else if(method.equals("Method5")) {
			return 99;
		} else if(method.equals("Method6")) {
			return -1000;
		} else {
			return 0;
		}
		
		
	}
}

public class TreeSetExample4 {
	public static void main(String[] args) {
		System.out.println("Method 1");
		System.out.println("I1.compareTo(I2) ==> Default Natural Sorting Order - Ascending order");
		System.out.println("Output should be [0, 5, 10, 15, 20]");
		System.out.println("===================================================================================");
		TreeSet t = new TreeSet(new MyComparator2("Method1"));
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		System.out.println("");
		
		System.out.println("Method 2");
		System.out.println("-I1.compareTo(I2) ==> Descending Order");
		System.out.println("Output should be [20, 15, 10, 5, 0]");
		System.out.println("===================================================================================");
		t = new TreeSet(new MyComparator2("Method2"));
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
		System.out.println("Method 3");
		System.out.println("I2.compareTo(I1) ==> Descending Order");
		System.out.println("Output should be [20, 15, 10, 5, 0]");
		System.out.println("===================================================================================");
		t = new TreeSet(new MyComparator2("Method3"));
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
		System.out.println("Method 4");
		System.out.println("-I2.compareTo(I1) ==> Ascending Order");
		System.out.println("Output should be [0, 5, 10, 15, 20]");
		System.out.println("===================================================================================");
		t = new TreeSet(new MyComparator2("Method4"));
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
		System.out.println("Method 5");
		System.out.println("any poitive value ==> Insertion Order (Duplicates allowed)");
		System.out.println("Output should be [10, 0, 15, 5, 20, 20]");
		System.out.println("===================================================================================");
		t = new TreeSet(new MyComparator2("Method5"));
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
		System.out.println("Method 6");
		System.out.println("Any negative value ==> Reverse of Insertion Order");
		System.out.println("Output should be [20, 20, 5, 15, 0, 10]");
		System.out.println("===================================================================================");
		t = new TreeSet(new MyComparator2("Method6"));
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
		System.out.println("Method 7");
		System.out.println("Zero being returned from Comparator");
		System.out.println("Output should be [10]. Only first element will be inserted and all remaining will be duplicate");
		System.out.println("===================================================================================");
		t = new TreeSet(new MyComparator2("Method7"));
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
	}
}
