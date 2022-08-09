package com.learnjava.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student2 {
	String studentName;
	int studentMarks;
	
	Student2(String studentName, int studentMarks) {
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	
	public String toString() {
		return "Student Name : " + studentName + "\n"
						+ "Student Marks : " + studentMarks;
	}
}

public class ConsumerIntrfDemo2 {
	public static void main(String[] args) {
		Function<Student2, String> fStudent = stu ->{
			if (stu.studentMarks >= 80) return "A [Distinction]";
			else if (stu.studentMarks >= 60) return "B [First class]";
			else if (stu.studentMarks >= 50) return "C [Second class]";
			else if (stu.studentMarks >= 35) return "D [Third class]";
			else return "E [Failed]";
		};
		
		Predicate<Student2> pFirstClassCheck = stu -> stu.studentMarks >= 60;
		
		Consumer<Student2> cPrintStudent = stu -> {
			System.out.println(stu);
			System.out.println("Student Grade : " + fStudent.apply(stu));
			System.out.println();
		};
		
		Student2 [] stu = {
				new Student2("Sandy", 100),
				new Student2("Andy", 65),
				new Student2("Greta", 55),
				new Student2("Bill", 45),
				new Student2("John", 25)
		};
		
		for (Student2 s : stu) {
			if(pFirstClassCheck.test(s)) {
				cPrintStudent.accept(s);
			}
		}
	}
}
