package student.beans;

public class CseStudent extends Student{
	private String laptop;
	private String language;
	
	public CseStudent(int id, String name, int score, Course course, String laptop, String language) {
	    super(id,name,score,course);
		this.laptop=laptop;
		this.language=language;
	}
	
	public String getLaptop() {
		return laptop;
	}
	
	public void setLaptop(String laptop) {
		this.laptop=laptop;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language=language;
	}
	
}
