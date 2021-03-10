package com.cg.apps.schoolmswithoutjpa.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student{

	@GeneratedValue
	@Id
	private Integer id;
	private String name;
	private int score;
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
