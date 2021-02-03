
public class StudentMain {

	public static void main(String args[]) {
        StudentMain project=new StudentMain();
        project.start();
				
	}
	
	public void start() {
		Student students[]=new Student[2];
		// initializing object with constructor as soon as it is constructed
		Student student1 = new Student(1,"abhishek",70);
		displayStudent(student1);
		
		Student student2 = new Student(2,"suriya",50);
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
		System.out.println("student " + id + " " + name + " " + score );

	}

}
