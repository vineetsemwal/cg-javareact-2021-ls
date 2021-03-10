package com.cg.apps.schoolmswithoutjpa.coursems.dao;

import com.cg.apps.schoolmswithoutjpa.coursems.entities.Course;

public interface ICourseDao {

    Course add(Course course);

    Course findById(int courseId);

    Course update(Course course);

}
