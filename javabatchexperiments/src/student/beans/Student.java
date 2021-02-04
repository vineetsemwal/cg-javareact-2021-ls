package student.beans;



public class Student {
	
	private int id;
	private String name;
	private int score;	
	private Course course;
	
	public Student(){
		this(-1,"not initialized",-1,null);
	}
	
	
	public Student(int id, String name, int score, Course course){
		this.setId(id);
		this.setName(name);
	    this.setScore(score);
	    this.setCourse(course);
	    
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
	
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course=course;
	}
	
}
