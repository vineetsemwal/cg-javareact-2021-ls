
public class Student {
	
	int id;
	String name;
	int score;
	
	Student(){
		id=-1;
		name="not inialized";
		score=-1;
	}
	
	Student(int id, String name, int score){
		this.id=id;
	    this.name=name;
	    this.score=score;
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
	
}
