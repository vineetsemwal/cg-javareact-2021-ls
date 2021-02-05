package student.ui;

import student.beans.*;

public class StudentMain {

	public static void main(String args[]) {
		StudentMain project = new StudentMain();
		project.start();
	}

	public void start() {
		Student students[] = new Student[2];
		Course course1 = new Course("c1", "computer science");
		Course course2 = new Course("c2", "Telecom");
		CseStudent cseStudent1 = new CseStudent(1, "abhishek", 70, course1, "lenovo", "java");
		displayStudent(cseStudent1);
        cseStudent1.setName("gunaditha");
		
		EceStudent eceStudent1 = new EceStudent(2, "suriya", 50, course2, "multimeter");
		cseStudent1.setName("abhishek nishad");// setting the value later

		students[0] = cseStudent1;
		students[1] = eceStudent1;

		for (int i = 0; i < students.length; i++) {
			Student iteratedStudent = students[i];
			boolean isCseStudent = iteratedStudent instanceof CseStudent;
			if (isCseStudent) {
				CseStudent cseStudent =(CseStudent) iteratedStudent;
				displayStudent(cseStudent);
			}
			
			if (iteratedStudent instanceof EceStudent) {
				EceStudent eceStudent = (EceStudent) iteratedStudent;
				displayStudent(eceStudent);
			}
		}

	}

	void displayBaseStudent(Student student) {
		int id = student.getId();
		String name = student.getName();
		int score = student.getScore();
		Course course = student.getCourse();
		String courseId = course.getCourseId();
		String courseName = course.getCourseName();
		System.out.println("student " + id + " " + name + " " + score);
		System.out.println("course is " + courseId + " " + courseName);

	}

	void displayStudent(EceStudent student) {
		displayBaseStudent(student);
		String device = student.getDevice();
		System.out.println("device=" + device);
	}

	void displayStudent(CseStudent student) {
		displayBaseStudent(student);
		String language = student.getLanguage();
		String laptop = student.getLaptop();
		System.out.println("laptop=" + laptop);
		System.out.println("language=" + language);
	}

}
