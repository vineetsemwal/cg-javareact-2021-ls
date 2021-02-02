
public class StudentMain {

	public static void main(String args[]) {
        StudentMain project=new StudentMain();
        project.start();
				
	}
	
	public void start() {
		Student students[]=new Student[2];
		Student student1 = new Student();
		student1.id = 1;
		student1.name = "abhishek";
		student1.score = 70;

		Student student2 = new Student();
		student2.id = 2;
		student2.name = "suriya";
		student2.score = 50;
		
		students[0]=student1;
		students[1]=student2;
		
		for(int i=0;i<students.length;i++) {
			Student iteratedStudent=students[i];
			displayStudent(iteratedStudent);			
		}

	}

	void displayStudent(Student student) {
		String feedback = student.performance();
		System.out.println("student " + student.id + " " + student.name + " " + 
		student.score + " " + feedback);

	}

}
