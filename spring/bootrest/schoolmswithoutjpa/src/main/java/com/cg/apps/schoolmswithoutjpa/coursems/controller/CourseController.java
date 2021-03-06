package com.cg.apps.schoolmswithoutjpa.coursems.controller;

import com.cg.apps.schoolmswithoutjpa.coursems.dto.AddCourseRequest;
import com.cg.apps.schoolmswithoutjpa.coursems.dto.AddStudentToCourseRequest;
import com.cg.apps.schoolmswithoutjpa.coursems.dto.CourseDetails;
import com.cg.apps.schoolmswithoutjpa.coursems.entities.Course;
import com.cg.apps.schoolmswithoutjpa.coursems.service.ICourseService;
import com.cg.apps.schoolmswithoutjpa.coursems.util.CourseUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("courses")
@RequestMapping("/courses")
@RestController
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @Autowired
    private CourseUtil courseUtil;

    @PostMapping("/add")
    public CourseDetails addCourse(@RequestBody AddCourseRequest requestData) {
       Course course= courseService.addCourse(requestData.getName());
       CourseDetails details=courseUtil.toCourseDetails(course);
       return details;
    }

    @GetMapping("/byid/{id}")
    public CourseDetails fetchCourse(@PathVariable("id")int id){
       Course course= courseService.findById(id);
       CourseDetails details=courseUtil.toCourseDetails(course);
       return details;
    }

    @PutMapping("/students/add")
    public CourseDetails addStudentToCourse(@RequestBody AddStudentToCourseRequest requestData)
    {
      Course course=  courseService.addStudentInCourse(requestData.getCourseId(),requestData.getStudentId());
      CourseDetails details=courseUtil.toCourseDetails(course);
      return details;
    }

}
