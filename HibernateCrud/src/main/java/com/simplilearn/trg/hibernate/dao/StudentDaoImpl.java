package com.simplilearn.trg.hibernate.dao;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.trg.hibernate.dto.Student;
import com.simplilearn.trg.hibernate.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao{

	private SessionFactory factory;
	//private String name; 
	public StudentDaoImpl()
	{
		factory=new HibernateUtil().getSessionFactory();
		//name="Yorker";
	}
	
	@Override
	public Integer addStudent(Student student) {
	
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		Integer rollNo=(Integer)session.save(student);
		txn.commit();
		session.close();
		return rollNo;
	}

	@Override
	public void deleteStudent(int rollNo) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		//1.retrieve object from DB
		Student student=session.get(Student.class, rollNo);
		//2.delete file with ROLLNUMBER=rollNO
		session.delete(student);
		
		txn.commit();
		session.close();
	}

	@Override
	public void updateStudent(int rollNo, char grade) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		
		//1.retrieve the object with specified roolNo
		Student student=session.get(Student.class, rollNo);//parameter rollNO which given inparmeter of updateStudent
		System.out.println("Before updation: "+student);
		//2.updaate the object by setter method
		student.setGrade(grade);
		System.out.println("After the updation: "+student);
		//3.send it back to the db
		session.update(student);
		txn.commit();
		session.close();
	}

	@Override
	public Set<Student> getAllStudent() {
		
		Set<Student> allStudents;
		//1.Create session
		Session session=factory.openSession();
		//no need for transaction as SELCET STATEMENt don't affect any row in the table
		String hql="from Student";//class name STudednt whose table in DB u want to execute
		TypedQuery<Student> typedQuery=session.createQuery(hql);
		allStudents=new LinkedHashSet<Student>(typedQuery.getResultList());
		return allStudents;
	}

}
