package com.cg.apps.schoolmswithjpa.studentms.controllers;

import com.cg.apps.schoolmswithjpa.studentms.dto.ChangeNameRequest;
import com.cg.apps.schoolmswithjpa.studentms.dto.CreateStudentRequest;
import com.cg.apps.schoolmswithjpa.studentms.dto.DeleteStudentRequest;
import com.cg.apps.schoolmswithjpa.studentms.dto.StudentDetails;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.service.IStudentService;

import java.util.List;

import com.cg.apps.schoolmswithjpa.studentms.util.StudentUtil;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/students")
@RestController
public class StudentRestController {

    private static final Logger LOG=LoggerFactory.getLogger(StudentRestController.class);

    @Autowired
    private IStudentService service;

    @Autowired
    private StudentUtil util;

    /**
     * /students/byid/2
     */
    @GetMapping(value = "/byid/{id}")
    public StudentDetails fetchStudent(@PathVariable("id") Integer studentId) {
       // System.out.println("studentid in fetchstudent in StudentRestController "+studentId);
        LOG.debug("studentid in fetchstudent in StudentRestController "+studentId);
        Student student = service.findById(studentId);
        StudentDetails details=util.toDetails(student);
        return details;
    }


    /**
     * /students
     */

    @GetMapping
    public List<StudentDetails> allStudents() {
        List<Student> list = service.findAll();
        List<StudentDetails>desired=util.toDetailsList(list);
        return desired;
    }

    /**
     * in post request ,data is sent as part of request body
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public String addStudent(@RequestBody CreateStudentRequest requestData) {
        Student created = service.addStudent(requestData.getName(), requestData.getScore());
        return "created student with id=" + created.getId();
    }

    @PutMapping("/changename")
    public StudentDetails changeName(@RequestBody ChangeNameRequest requestData) {
        Student student = service.updateName(requestData.getId(), requestData.getName());
        StudentDetails desired=util.toDetails(student);
        return desired;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody DeleteStudentRequest requestData){
        service.deleteById(requestData.getId());
        return "student deleted for id="+requestData.getId();
    }



}
