package com.learnjava.java8features.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	String eName;
	int eNumber;
	public Employee(String eName, int eNumber) {
		this.eName = eName;
		this.eNumber = eNumber;
	}
	
	@Override
	public String toString() {
		return "Employee [eNumber=" + eNumber + "; eName=" + eName + "]";
	}
	
}

public class FuntionalInterfaceDemo3 {

	
	
	public static void main(String[] args) {
		ArrayList<Employee> el = new ArrayList<Employee>();
		el.add(new Employee("Sandy", 872425));
		el.add(new Employee("Sunny", 212545));
		el.add(new Employee("Bunny", 121214));
		el.add(new Employee("Jim", 545454));
		el.add(new Employee("Jam", 424345));
		System.out.println(el);
		Collections.sort(el, (e1,e2)->(e1.eNumber>e2.eNumber)?1:(e1.eNumber<e2.eNumber)?-1:0);
		System.out.println(el);
		
		Collections.sort(el, (e1,e2)->(e1.eName.compareTo(e2.eName)));
		System.out.println(el);
	}

}
