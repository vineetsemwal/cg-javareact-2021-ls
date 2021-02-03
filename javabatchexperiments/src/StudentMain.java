
public class StudentMain {

	public static void main(String args[]) {
        StudentMain project=new StudentMain();
        project.start();
				
	}
	
	public void start() {
		Student students[]=new Student[2];
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("abhishek");
		student1.setScore(70);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("suriya");
		student2.setScore(50);
		
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
