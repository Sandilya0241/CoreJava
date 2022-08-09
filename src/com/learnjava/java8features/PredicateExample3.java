package com.learnjava.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee  {
	String eName;
	double salary;
	char gender;
	int age;
	
	Employee(String eName, double salary, char gender, int age) {
		this.eName = eName;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
	}
}

public class PredicateExample3 {

	public static void main(String[] args) {
		
		ArrayList<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee("Employee101", 1000, 'M', 30));
		eList.add(new Employee("Employee111", 1200, 'F', 28));
		eList.add(new Employee("Employee121", 3600, 'F', 48));
		eList.add(new Employee("Employee114", 3200, 'F', 34));
		eList.add(new Employee("Employee117", 1600, 'M', 28));
		eList.add(new Employee("Employee131", 3800, 'M', 40));
		eList.add(new Employee("Employee132", 2000, 'M', 32));
		
		Predicate<Employee> p = e -> ((e.gender == 'M' && e.age > 30) || (e.gender == 'F' && e.age > 40));
	
		for (Employee e : eList) {
			if(p.test(e)) {
				System.out.println(e.eName + "..." +e.age + "..." + e.gender);
			}
		}
	}

}
