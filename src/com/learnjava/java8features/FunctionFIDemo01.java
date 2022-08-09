package com.learnjava.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;
	
	Student(String name, int marks) {
		this.marks = marks;
		this.name = name;
	}
}

public class FunctionFIDemo01 {
	public static void main(String[] args) {
		Function<Student, String> f = s-> {
			if(s.marks >= 80) return "A grade [Distinction]";
			else if(s.marks >= 60) return "B grade [First class]";
			else if(s.marks >= 50) return "C grade [Second class]";
			else if(s.marks >= 35) return "D grade [Third class]";
			else return "E grade [Failed]";
		};
		
		Predicate<Student> p = s -> s.marks >= 60;
		
		Student [] stu = {
				new Student("Sandy", 100),
				new Student("Andy", 65),
				new Student("Greta", 55),
				new Student("Bill", 45),
				new Student("John", 25)
		};
		
		
		for (Student s : stu) {
			
			if(p.test(s)) {
				System.out.println("Student Name : " + s.name + "; Marks : " + s.marks + "; Grade : " + f.apply(s));
			}
		}
	}
}
