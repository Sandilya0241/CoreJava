package com.learnjava.designpatterns.daopattern;

import java.util.List;

public interface StudentDAO {
	public List<Student> getAllStudents();
	public Student getStudent(int nRollNum);
	public void UpdateStudent(Student student);
	public void DeleteStudent(Student student);
}
