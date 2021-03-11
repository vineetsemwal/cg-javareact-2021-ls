package com.cg.apps.schoolmswithjpa.studentms.util;

import com.cg.apps.schoolmswithjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithjpa.studentms.dto.StudentDetails;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class StudentUtil {

    public StudentDetails toDetails(Student student){
        StudentDetails details=new StudentDetails();
        details.setId(student.getId());
        details.setName(student.getName());
        details.setScore(student.getScore());
        Course course=student.getCourse();
        if(course!=null) {
            details.setCourseId(course.getCourseId());
            details.setCourseName(course.getName());
        }
        return details;
    }


    public List<StudentDetails> toDetailsList(Collection<Student> students ){
        List<StudentDetails>desired=new ArrayList<>();
        for (Student student:students){
            StudentDetails details=toDetails(student);
            desired.add(details);
        }
        return desired;

    }


    /*
    public List<StudentDetails>toDetails(Collection<Student> students){
      List<StudentDetails>desired=  students.stream().map(student->toDetails(student)).collect(Collectors.toList());
      return  desired;
    }
    */

}
