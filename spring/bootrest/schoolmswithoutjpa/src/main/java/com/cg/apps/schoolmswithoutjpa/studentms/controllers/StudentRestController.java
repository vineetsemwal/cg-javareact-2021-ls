package com.cg.apps.schoolmswithoutjpa.studentms.controllers;

import com.cg.apps.schoolmswithoutjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithoutjpa.studentms.dto.ChangeNameRequest;
import com.cg.apps.schoolmswithoutjpa.studentms.dto.CreateStudentRequest;
import com.cg.apps.schoolmswithoutjpa.studentms.dto.DeleteStudentRequest;
import com.cg.apps.schoolmswithoutjpa.studentms.dto.StudentDetails;
import com.cg.apps.schoolmswithoutjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithoutjpa.studentms.service.IStudentService;

import java.util.List;

import com.cg.apps.schoolmswithoutjpa.studentms.util.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Validated
@RequestMapping("/students")
@RestController
public class StudentRestController {

    @Autowired
    private IStudentService service;

    @Autowired
    private StudentUtil util;

    /**
     * /students/byid/2
     */
    @GetMapping("/byid/{id}")
    public StudentDetails fetchStudent(@PathVariable("id")  Integer studentId) {
        Student student = service.findById(studentId);
        StudentDetails details=util.toDetails(student);
        return details;
    }

/*
    @GetMapping("/byscore/{score}")
    public List<StudentDetails> fetchStudentsByScore(@PathVariable("score") @Min(0) @Max(100) int score) {

        return details;
    }

    @GetMapping("/byname/{name}")
    public List<StudentDetails> fetchStudentsByName(@PathVariable("name") @NotBlank String name) {

        return details;
    }

*/

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
    public String addStudent(@RequestBody @Valid CreateStudentRequest requestData) {
        Student created = service.addStudent(requestData.getName(), requestData.getScore());
        return "created student with id=" + created.getId();
    }

    @PutMapping("/changename")
    public StudentDetails changeName(@RequestBody @Valid ChangeNameRequest requestData) {
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
