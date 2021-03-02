package com.cg.apps.schoolms.dao;

import java.util.*;

import com.cg.apps.schoolms.entities.Student;
import com.cg.apps.schoolms.exceptions.StudentNotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class StudentDaoImpl implements IStudentDao {

	 private EntityManager entityManager;

	 public EntityManager getEntityManager() {
	 	if(entityManager==null){
	 		entityManager=JpaUtil.getInstance().getEntityManager();
		}
	 	return entityManager;
	 }


	@Override
	public void add(Student student) {
		getEntityManager().persist(student);
	}

	@Override
	public Student findById(int id) {
		Student student=checkStudentExists(id);
	    return student;
	}

	@Override
	public List<Student>findAll(){
		String ql="from Student";
		TypedQuery<Student> query=getEntityManager().createQuery(ql,Student.class);
		List<Student>list=query.getResultList();
		return list;

	}

	@Override
	public List<Student> findStudentsByScore(int score){
	 	String ql="from Student where score=:scoreArg";
	 	TypedQuery<Student> query=getEntityManager().createQuery(ql,Student.class);
	 	query.setParameter("scoreArg",score);
	 	List<Student>list=query.getResultList();
	    return list;
	 }

	@Override
	public Student update(Student student){
	 	checkStudentExists(student.getId());
	 	student=getEntityManager().merge(student);
	    return student ;
	 }

	 Student checkStudentExists(int id){
		 Student student=getEntityManager().find(Student.class,id);
		 if(student==null){
			 throw new StudentNotFoundException("student not found for id="+id);
		 }
		 return student;
	 }

}
