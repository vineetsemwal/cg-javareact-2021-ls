package com.cg.apps.schoolmswithjpa.coursems.dao;

import com.cg.apps.schoolmswithjpa.coursems.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course,Integer> {
}
