package student.beans;

public class EceStudent extends Student{

	private String device;
	
	public EceStudent(int id, String name, int score, Course course, String device) {
		super(id,name,score,course);
		this.device=device;
	}
	
	public String getDevice() {
		return device;
	}
	
	public void setDevice(String device) {
		this.device=device;
	}
	
}
