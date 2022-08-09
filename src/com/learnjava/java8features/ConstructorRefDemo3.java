package com.learnjava.java8features;


class Student5 {
	String name;
	int rollNo;
	int marks;
	int age;
	
	Student5(String name, int rollNo, int marks, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student5 [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", age=" + age + "]";
	}
}

@FunctionalInterface
interface interfStudent {
	public Student5 get(String name, int rollNo, int marks, int age);
}

public class ConstructorRefDemo3 {
	public static void main(String[] args) {
		interfStudent i = Student5::new;
		System.out.println(i.get("Sandy", 23, 100, 23));
		
	}
}
