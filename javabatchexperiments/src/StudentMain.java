
public class StudentMain {

	public static void main(String args[]) {
        StudentMain project=new StudentMain();
        project.start();				
	}
	
	public void start() {
		Student students[]=new Student[2];
		Course course1=new Course("c1","java");
		Course course2=new Course("c2","react");
		Student student1 = new Student(1,"abhishek",70, course1);
		displayStudent(student1);
		
		Student student2 = new Student(2,"suriya",50, course2);
		student1.setName("abhishek nishad");//setting the value later
		
		students[0]=student1;
		students[1]=student2;
		
		for(int i=0;i<students.length;i++) {
			Student iteratedStudent=students[i];
			displayStudent(iteratedStudent);			
		}

	}

	void displayStudent(Student student) {
		int id=student.getId();
		String name=student.getName();
		int score=student.getScore();
		Course course=student.getCourse();
		String courseId=course.getCourseId();
		String courseName=course.getCourseName();
		System.out.println("student " + id + " " + name + " " + score );
		System.out.println("course is "+courseId +" "+ courseName);

	}

}
