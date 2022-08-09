package com.learnjava.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		
		if (I1 > I2) {
			return -1;
		} else if (I1 < I2){
			return 1;
		}
		else {
			return 0;
		}
	}
}

public class TreeSetExample003 {
	public static void main(String[] args) {
		System.out.println("Cutomized sorting order");
		System.out.println("=====================================================");
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		System.out.println("");
		
		System.out.println("Default sorting order");
		System.out.println("=====================================================");
		
		t = new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}
