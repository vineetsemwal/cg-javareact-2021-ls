package com.cg.schoolms.entities;



public class Student{
	
	private int id;
	private String name;
	private int score;
	public Student(){
		this("not initialized",-1);
	}
	
	
	public Student(String name, int score){
		this.setName(name);
	    this.setScore(score);
	    
	}
	
    public int getId() {
		return id;
	}
	
	public void setId(int id) {
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

}
