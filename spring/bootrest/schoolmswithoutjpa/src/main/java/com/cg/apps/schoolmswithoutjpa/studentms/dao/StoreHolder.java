package com.cg.apps.schoolmswithoutjpa.studentms.dao;

import java.util.*;

import com.cg.apps.schoolmswithoutjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithoutjpa.studentms.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StoreHolder {

    public StoreHolder() {
    }

    private Map<Integer, Student> studentsStore = new HashMap<>();

    public Map<Integer, Student> getStudentsStore() {
        return studentsStore;
    }

    private Map<Integer, Course> coursesStore=new HashMap<>();

    public Map<Integer, Course> getCoursesStore() {
        return coursesStore;
    }
}
