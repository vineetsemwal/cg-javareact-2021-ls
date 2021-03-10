package com.cg.apps.schoolmswithoutjpa.controllers;

import com.cg.apps.schoolmswithoutjpa.entities.Student;
import com.cg.apps.schoolmswithoutjpa.service.IStudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/students")
@RestController
public class StudentRestController {

    @Autowired
    private IStudentService service;

    /**
     * /students/byid/2
     */
    @GetMapping(value = "/byid/{id}")
    public Student fetchStudent(@PathVariable("id") int studentId) {
        Student student = service.findById(studentId);
        return student;
    }

    /**
     * /students
     */
    @GetMapping
    public List<Student> allStudents() {
        List<Student> list = service.findAll();
        return list;
    }

    /**
     * in post request ,data is sent as part of request body
     */
    @PostMapping("/add")
    public String addStudent(@RequestBody Student requestData) {
        Student created = service.addStudent(requestData.getName(), requestData.getScore());
        return "created student with id=" + created.getId();
    }


    @PutMapping("/changename")
    public Student changeName(@RequestBody Student student) {
        student = service.updateName(student.getId(), student.getName());
        return student;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Student student){
        service.deleteById(student.getId());
        return "student deleted for id="+student.getId();
    }


}
