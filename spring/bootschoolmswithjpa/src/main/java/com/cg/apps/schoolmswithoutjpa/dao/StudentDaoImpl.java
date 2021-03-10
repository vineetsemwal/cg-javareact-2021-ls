package com.cg.apps.schoolmswithoutjpa.dao;

import java.util.*;

import com.cg.apps.schoolmswithoutjpa.entities.Student;
import com.cg.apps.schoolmswithoutjpa.exceptions.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


@Repository
public class StudentDaoImpl implements IStudentDao {

	//@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void add(Student student) {
		entityManager.persist(student);
	}

	@Override
	public Student findById(int id) {
		Student student=entityManager.find(Student.class,id);
		if(student==null){
			throw new StudentNotFoundException("student doesn't exist for id="+id);
		}
	    return student; 
	}

	@Override
	public List<Student> findAll() {
		String ql="from Student";
		TypedQuery<Student> query=entityManager.createQuery(ql,Student.class);
		List<Student>students=query.getResultList();
		return students;
	}

}
