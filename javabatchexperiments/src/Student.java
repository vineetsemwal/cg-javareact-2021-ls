
public class Student {
	
	int id;
	String name;
	int score;
	
	Course course;
	
	Student(){
		this(-1,"not initialized",-1,null);
	}
	
	
	Student(int id, String name, int score, Course course){
		this.id=id;
	    this.name=name;
	    this.score=score;
	    this.course=course;
	}
	
	int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id=id;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	int getScore() {
		return score;
	}
	
	void setScore(int score) {
		this.score=score;
	}
	
	
	Course getCourse() {
		return course;
	}
	
	void setCourse(Course course) {
		this.course=course;
	}
	
}
