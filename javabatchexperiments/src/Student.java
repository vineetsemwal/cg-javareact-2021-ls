
public class Student {
	
	int id;
	String name;
	int score;
	
	public String performance() {
		String performanceValue;
		if(score>60) {
			performanceValue="good";
		}else {
			performanceValue="poor";
		}
		return performanceValue;
	}

}
