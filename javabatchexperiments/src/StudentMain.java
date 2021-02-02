
public class StudentMain {

	public static void main(String args[]) {
		Student student1 = new Student();
		student1.id = 1;
		student1.name = "abhishek";
		student1.score = 70;

		Student student2 = new Student();
		student2.id = 2;
		student2.name = "suriya";
		student2.score = 50;

		displayStudent(student1);
		displayStudent(student2);
	}

	static void displayStudent(Student student) {
		String feedback = student.performance();
		System.out.println("student " + student.id + " " + student.name + " " + student.score + " " + feedback);

	}

}
