package com.cg.apps.schoolmswithjpa.studentms.dao;


import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);

    List<Student> findByScore(int score);
}
