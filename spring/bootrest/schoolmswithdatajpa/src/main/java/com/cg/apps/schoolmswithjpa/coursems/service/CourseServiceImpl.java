package com.cg.apps.schoolmswithjpa.coursems.service;

import com.cg.apps.schoolmswithjpa.coursems.dao.ICourseRepository;
import com.cg.apps.schoolmswithjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithjpa.coursems.exceptions.CourseNotFoundException;
import com.cg.apps.schoolmswithjpa.studentms.dao.IStudentRepository;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    private ICourseRepository courseRepo;

    @Autowired
    private IStudentRepository studentRepo;

    @Transactional
    @Override
    public Course addCourse(String name) {
       Course course = new Course();
       course.setName(name);
       course= courseRepo.save(course);
       return course;
    }

    @Override
    public Course findById(int courseId) {
        Optional<Course> optional = courseRepo.findById(courseId);
        if(!optional.isPresent()){
            throw new CourseNotFoundException("course not found for id="+courseId);
        }
        return optional.get();
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
       Optional<Student> optionalStudent= studentRepo.findById(studentId);
       if(!optionalStudent.isPresent()){
           throw new StudentNotFoundException("student not found for id="+studentId);
       }
       Student student=optionalStudent.get();
       students.add(student);
       student.setCourse(course);
       student=studentRepo.save(student);
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
        Optional<Student> optionalStudent= studentRepo.findById(studentId);
        if(!optionalStudent.isPresent()){
            throw new StudentNotFoundException("student not found for id="+studentId);
        }
        Student student=optionalStudent.get();
        students.remove(student);
        student.setCourse(null);
        student=studentRepo.save(student);
        return course;
    }
}
