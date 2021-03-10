package com.cg.apps.schoolmswithoutjpa.coursems.service;

import com.cg.apps.schoolmswithoutjpa.coursems.entities.Course;

public interface ICourseService {

    Course addCourse(String name);

    Course addStudentInCourse(int courseId,int studentId);

    Course removeStudentFromCourse(int courseId,int studentId);

    Course findById(int courseId);

}
