package com.cg.apps.schoolmswithjpa.coursems.util;

import com.cg.apps.schoolmswithjpa.coursems.dto.CourseDetails;
import com.cg.apps.schoolmswithjpa.coursems.entities.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CourseUtil {

    public CourseDetails toCourseDetails(Course course){
        CourseDetails courseDetails=new CourseDetails(course.getCourseId(),course.getName());
        return courseDetails;
    }

    public List<CourseDetails> toCourseDetailsList(Collection<Course> courses){
        List<CourseDetails>desired=new ArrayList<>();
        for(Course course:courses){
            CourseDetails details=toCourseDetails(course);
            desired.add(details);
        }
        return desired;
    }

}
