package com.cg.apps.schoolmswithjpa.coursems.service;

import com.cg.apps.schoolmswithjpa.coursems.entities.Course;

public interface ICourseService {

    Course addCourse(String name);

    Course addStudentInCourse(int courseId,int studentId);

    Course removeStudentFromCourse(int courseId,int studentId);

    Course findById(int courseId);

}
