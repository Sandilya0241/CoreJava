package com.learnjava.collections;

public class Employee implements Comparable{
	String empName;
	int empID;
	
	Employee(String empName, int empID) {
		this.empName = empName;
		this.empID = empID;
	}
	
	public String toString() {
		return empName + " - " + empID;
	}
	
	public int compareTo(Object Obj1) {
		Employee e1 = (Employee)Obj1;
		if(empID > e1.empID) {
			return 1;
		} else if(empID < e1.empID) {
			return -1;
		} else {
			return 0;
		}
	}
}
