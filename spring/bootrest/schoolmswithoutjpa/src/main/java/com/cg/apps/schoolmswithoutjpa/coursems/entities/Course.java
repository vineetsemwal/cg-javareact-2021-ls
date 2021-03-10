package com.cg.apps.schoolmswithoutjpa.coursems.entities;

import com.cg.apps.schoolmswithoutjpa.studentms.entities.Student;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Course {
    private int courseId;
    private String name;
    private Set<Student> students;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return courseId+" "+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
