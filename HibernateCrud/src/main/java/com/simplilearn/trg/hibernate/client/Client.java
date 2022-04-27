package com.simplilearn.trg.hibernate.client;

import java.util.Set;

import com.simplilearn.trg.hibernate.dao.StudentDao;
import com.simplilearn.trg.hibernate.dao.StudentDaoImpl;
import com.simplilearn.trg.hibernate.dto.Student;

public class Client {

	
	public static void main(String[] args) {
		
		StudentDao dao=new StudentDaoImpl();
		
		//1.Create object
		Student student1=new Student("RAhul",'C');
		Student student2=new Student("Yorker",'A');
		Student student3=new Student("Bouncer",'B');
		Student student4=new Student("Ssioi",'E');
		
		int rollNo1=(Integer)dao.addStudent(student1);
		int rollNo2=(Integer)dao.addStudent(student2);
		int rollNo3=(Integer)dao.addStudent(student3);
		int rollNo4=(Integer)dao.addStudent(student4);
		
		
		System.out.println("Roll no:s1 " +rollNo1);
		System.out.println("Roll no:s1 " +rollNo2);
		System.out.println("Roll no:s1 " +rollNo3);
		System.out.println("Roll no:s1 " +rollNo4);
		
		
		//2.Now for update
//		dao.updateStudent(5, 'A');
		
		//3.delete Yorker student
		//dao.deleteStudent(5);
		
		
		//4.show the allStudents in console
//		Set<Student> allStudents=dao.getAllStudent();
//		System.out.println(allStudents);
//		
	}
}
