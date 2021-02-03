
public class Course {

	String courseId;	
	String courseName;
	
	Course(String id, String name){
		this.courseId=id;
		this.courseName=name;
	}
	
	String getCourseId() {
		return courseId;
	}
	
	void setCourseId(String courseId) {
		this.courseId=courseId;
	}
	
	String getCourseName() {
		return courseName;
	}
	
	void setCourseName(String name) {
		this.courseName=name;
	}
}
