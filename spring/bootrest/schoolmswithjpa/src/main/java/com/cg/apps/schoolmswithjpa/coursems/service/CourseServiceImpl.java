package com.cg.apps.schoolmswithjpa.coursems.service;

import com.cg.apps.schoolmswithjpa.coursems.dao.ICourseDao;
import com.cg.apps.schoolmswithjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithjpa.studentms.dao.IStudentDao;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    private ICourseDao courseDao;

    @Autowired
    private IStudentDao studentDao;

    @Transactional
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

    @Transactional
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

    @Transactional
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
