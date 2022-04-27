package com.simplilearn.trg.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Management_System")

public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RollNO")
	private int rollNo;
	
	@Column(name="Student_name")
	private String name;
	
	@Column(name="Grade")
	private char grade;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Student() {
	
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + "]";
	}

	public Student(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}
	
	
	
	
}
