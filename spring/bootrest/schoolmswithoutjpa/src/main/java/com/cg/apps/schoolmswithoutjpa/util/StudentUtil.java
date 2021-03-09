package com.cg.apps.schoolmswithoutjpa.util;

import com.cg.apps.schoolmswithoutjpa.dto.StudentDetails;
import com.cg.apps.schoolmswithoutjpa.entities.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentUtil {

    public StudentDetails toDetails(Student student){
        StudentDetails details=new StudentDetails(student.getId(), student.getName(),student.getScore());
        return details;
    }

    public List<StudentDetails> toDetailsList(Collection<Student> students){
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
