package student.beans;

public class Course {

	private String courseId;	
	private String courseName;
	
	public Course(String id, String name){
		this.courseId=id;
		this.courseName=name;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId=courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String name) {
		this.courseName=name;
	}

	@Override
	public String toString() {
       String text="courseId:"+courseId+"- courseName:"+courseName;
       return text;
	}
}
