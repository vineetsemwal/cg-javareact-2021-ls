package com.cg.apps.schoolmswithoutjpa.coursems.dao;

import com.cg.apps.schoolmswithoutjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithoutjpa.coursems.exceptions.CourseNotFoundException;
import com.cg.apps.schoolmswithoutjpa.studentms.dao.StoreHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;

@Repository
public class CourseDaoImpl implements ICourseDao{

    private Map<Integer,Course> coursesStore;

    @Autowired
    private StoreHolder storeHolder;

    @PostConstruct
    public void afterInit(){
    coursesStore=storeHolder.getCoursesStore();
    }

   public int generateId(){
        return coursesStore.size()+1;
   }


    @Override
    public Course add(Course course) {
        int generatedId=generateId();
        course.setCourseId(generatedId);
        coursesStore.put(generatedId,course);
        return course;
    }

    @Override
    public Course findById(int courseId) {
       if( !coursesStore.containsKey(courseId)){
           throw new CourseNotFoundException("course not found for id="+courseId);
       }
       Course course =coursesStore.get(courseId);
       return course;
    }

    @Override
    public Course update(Course course) {
        coursesStore.put(course.getCourseId(),course);
        System.out.println(coursesStore);
        return course;
    }
}
