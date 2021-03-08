package com.cg.apps.schoolmswithoutjpa.dao;

import java.util.*;

import com.cg.apps.schoolmswithoutjpa.entities.Student;
import com.cg.apps.schoolmswithoutjpa.exceptions.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;


@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private StoreHolder storeHolder;

	private Map<Integer, Student> store;


	@PostConstruct
	public void afterInit(){
		store=storeHolder.getStore();
	}


	public int generateId() {
    	int generatedId=store.size()+1;
	    return generatedId;
	}


	@Override
	public void add(Student student) {
		int id=generateId();
		student.setId(id);
		store.put(id, student);
	}

	@Override
	public Student findById(int id) {
		if(!store.containsKey(id)) {
			throw new StudentNotFoundException("student doesn't exist for id="+id);
		}
		Student student=store.get(id);
	    return student; 
	}

	@Override
	public List<Student> findAll() {
		Collection<Student>students=store.values();
		List<Student>list=new ArrayList<>(students);
		return list;		
	}

}
