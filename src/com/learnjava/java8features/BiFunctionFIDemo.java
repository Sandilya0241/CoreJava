package com.learnjava.java8features;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee4 {
	int empNumber;
	String empName;
	
	public Employee4(int empNumber, String empName) {
		this.empName = empName;
		this.empNumber = empNumber;
	}
	
	@Override
	public String toString() {
		return "Employee Name : " + empName + "\nEmployee Number : " + empNumber;
	}
}

public class BiFunctionFIDemo {
	public static void main(String[] args) {
		ArrayList<Employee4> listOfEmps = new ArrayList<Employee4>();
		
		BiFunction<Integer, String, Employee4> biFuncEmp = (num, name) -> {
			return new Employee4(num, name);
		};
		
		listOfEmps.add(biFuncEmp.apply(100, "Sandy"));
		listOfEmps.add(biFuncEmp.apply(200, "Candy"));
		listOfEmps.add(biFuncEmp.apply(250, "Andy"));
		listOfEmps.add(biFuncEmp.apply(400, "Rajeev"));
		
		for (Employee4 e : listOfEmps) {
			System.out.println(e);
			System.out.println();
		}
	}
}
