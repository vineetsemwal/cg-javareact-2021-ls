package com.cg.apps.schoolmswithoutjpa.coursems.dto;



public class CourseDetails {
    private int courseId;
    private String name;

    public CourseDetails() {

    }

    public CourseDetails(int courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
