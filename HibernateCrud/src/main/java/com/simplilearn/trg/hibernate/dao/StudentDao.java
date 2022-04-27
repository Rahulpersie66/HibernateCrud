package com.simplilearn.trg.hibernate.dao;

import java.util.Set;

import com.simplilearn.trg.hibernate.dto.Student;

public interface StudentDao {

	public Integer addStudent(Student student); //return type INTEGER as primary key ROllNo should be sent back
	public void deleteStudent(int rollNo);
	public void updateStudent(int rollNo,char grade);
	public Set<Student> getAllStudent();
	
}
