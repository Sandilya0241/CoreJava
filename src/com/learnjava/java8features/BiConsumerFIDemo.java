package com.learnjava.java8features;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee5 {
	String empName;
	double empSalary;
	
	public Employee5(String empName, double empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee Name : " + empName + "\nEmployee Salary : " + empSalary;
	}
}

public class BiConsumerFIDemo {
	public static void main(String[] args) {
		ArrayList<Employee5> listOfEmps = new ArrayList<Employee5>();
		populateData(listOfEmps);
		
		BiConsumer<Employee5, Double> biConsEmp = (emp, sal) -> emp.empSalary += sal;
		
		for (Employee5 e : listOfEmps) {
			biConsEmp.accept(e, 500.0);
		}
		
		for (Employee5 e : listOfEmps) {
			System.out.println(e);
			System.out.println();
		}
	}
	
	public static void populateData(ArrayList<Employee5> listOfEmps) {
		
		listOfEmps.add(new Employee5("Sandy", 1000));
		listOfEmps.add(new Employee5("Candy", 2000));
		listOfEmps.add(new Employee5("Andy", 3000));
		listOfEmps.add(new Employee5("Rajeev", 5000));
		
	}
}
