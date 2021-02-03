
public class Student {
	
	int id;
	String name;
	int score;
	
	Student(){
		id=-1;
		name="not inialized";
		score=-1;
	}
	
	Student(int idArg, String nameArg, int scoreArg){
		id=idArg;
	    name=nameArg;
	    score=scoreArg;
	}
	
	int getId() {
		return id;
	}
	
	void setId(int idArg) {
		id=idArg;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String nameArg) {
		name=nameArg;
	}
	
	int getScore() {
		return score;
	}
	
	void setScore(int scoreArg) {
		score=scoreArg;
	}
	
}
