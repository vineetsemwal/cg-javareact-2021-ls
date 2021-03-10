package com.cg.apps.schoolmswithoutjpa.coursems.service;

import com.cg.apps.schoolmswithoutjpa.coursems.dao.ICourseDao;
import com.cg.apps.schoolmswithoutjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithoutjpa.studentms.dao.IStudentDao;
import com.cg.apps.schoolmswithoutjpa.studentms.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    private ICourseDao courseDao;

    @Autowired
    private IStudentDao studentDao;

    @Override
    public Course addCourse(String name) {
       Course course = new Course();
       course.setName(name);
       course=courseDao.add(course);
       return course;
    }

    @Override
    public Course findById(int courseId) {
        Course course = courseDao.findById(courseId);
        return course;
    }

    @Override
    public Course addStudentInCourse(int courseId, int studentId) {
       Course course=findById(courseId);
       Set<Student> students= course.getStudents();
       if(students == null){
           students=new HashSet<>();
           course.setStudents(students);
       }
       Student student=studentDao.findById(studentId);
       students.add(student);
       course=courseDao.update(course);
       student.setCourse(course);
       studentDao.update(student);
       return course;
    }

    @Override
    public Course removeStudentFromCourse(int courseId, int studentId) {
        Course course=findById(courseId);
        Set<Student> students= course.getStudents();
        if(students == null){
            return course;
        }
        Student student=studentDao.findById(studentId);
        students.remove(student);
        return course;
    }
}
