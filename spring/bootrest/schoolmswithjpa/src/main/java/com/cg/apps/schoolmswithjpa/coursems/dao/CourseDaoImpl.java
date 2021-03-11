package com.cg.apps.schoolmswithjpa.coursems.dao;

import com.cg.apps.schoolmswithjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithjpa.coursems.exceptions.CourseNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Map;

@Repository
public class CourseDaoImpl implements ICourseDao{

    //@Autowired
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Course add(Course course) {
         entityManager.persist(course);
        return course;
    }

    @Override
    public Course findById(int courseId) {
       Course course =entityManager.find(Course.class,courseId);
       if(course==null){
           throw new CourseNotFoundException("course not found for id="+courseId);
       }
       return course;
    }

    @Override
    public Course update(Course course) {
        course=entityManager.merge(course);
        return course;
    }
}
