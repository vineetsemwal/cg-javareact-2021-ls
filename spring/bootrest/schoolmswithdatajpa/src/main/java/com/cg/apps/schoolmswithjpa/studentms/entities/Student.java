package com.cg.apps.schoolmswithjpa.studentms.entities;


import com.cg.apps.schoolmswithjpa.coursems.entities.Course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Student{

	@GeneratedValue
	@Id
	private Integer id;
	private String name;
	private int score;

	@ManyToOne
    private Course course;

	public Student(){
		this("not initialized",-1);
	}
	
	
	public Student(String name, int score){
		this.setName(name);
	    this.setScore(score);
	}
	
    public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score=score;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		String text="id:"+id +" name-"+name+"-"+score;
	    return text;
	}


	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		 if(obj==null || !(obj instanceof Student)) {
			 return false;
		 }
		 Student that=(Student)obj;
		return this.id==that.id;
	}
	
	
	
	
}
