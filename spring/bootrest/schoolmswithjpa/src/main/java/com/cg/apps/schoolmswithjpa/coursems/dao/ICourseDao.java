package com.cg.apps.schoolmswithjpa.coursems.dao;

import com.cg.apps.schoolmswithjpa.coursems.entities.Course;

public interface ICourseDao {

    Course add(Course course);

    Course findById(int courseId);

    Course update(Course course);

}
