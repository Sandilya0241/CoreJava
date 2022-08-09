package com.learnjava.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee e1 = new Employee("Nag", 100);
		Employee e2 = new Employee("Balaiah", 200);
		Employee e3 = new Employee("Chiru", 50);
		Employee e4 = new Employee("Venky", 150);
		Employee e5 = new Employee("Nag", 100);
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		t = new TreeSet(new MyComparator6());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}

class MyComparator6 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		
		String s1 = e1.empName;
		String s2 = e2.empName;
		return s1.compareTo(s2);
	}
}