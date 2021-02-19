package com.cg.schoolms.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.*;

import com.cg.schoolms.dao.StoreHolder;
import com.cg.schoolms.entities.Student;
import com.cg.schoolms.exceptions.InvalidScoreException;
import com.cg.schoolms.exceptions.InvalidStudentNameException;

import java.util.*;

class StudentServiceImplTest {
	StudentServiceImpl service;
	Map<Integer, Student> store = StoreHolder.getInstance().getStore();

	@BeforeEach
	public void setup() {
		service = new StudentServiceImpl();
	}

	@AfterEach
	public void clear() {
		store.clear();
	}

	/**
	 * test scenario : Student is added successfully 
	 * inputs: name=rohit , score=80
	 * precondition: store is empty
	 * 
	 */
	@Test
	void testAddStudent_1() {
		final String name = "rohit";
		final int score = 70;
		Student result = service.addStudent(name, score);
		assertEquals(name, result.getName());
		assertEquals(score, result.getScore());
		assertTrue(result.getId() > 0);
		System.out.println("store=" + store);
		assertEquals(1, store.size());
		Set<Integer> keys = store.keySet();
		int storedId = keys.iterator().next();
		Student storedValue = store.get(storedId);
		assertEquals(storedId, result.getId());
		assertEquals(storedValue, result);
	}

	/**
	 * test scenario: InvalidStudentNameException is thrown was name is empty
	 * inputs: name="" , score=80
	 * 
	 */
	@Test
	void testAddStudent_2() {
		final String name = "";
		final int score = 70;
		/*
		 * Executable executable=new Executable() {
		 * 
		 * @Override public void execute() throws Throwable { service.addStudent(name,
		 * score); }
		 * 
		 * };
		 */
		Executable executable = () -> service.addStudent(name, score);
		assertThrows(InvalidStudentNameException.class, executable);
	}

	/**
	 * test scenario: InvalidScoreException is thrown inputs: name="abhishek" ,
	 * score=-1
	 * 
	 */
	@Test
	void testAddStudent_3() {
		final String name = "abhishek";
		final int score = -1;
		Executable executable = () -> service.addStudent(name, score);
		assertThrows(InvalidScoreException.class, executable);
	}
	
	
	

}
