package student.ui;

import student.beans.*;
import student.exceptions.InvalidIdException;
import student.exceptions.StudentNotFoundException;

public class StudentMain {

    private Student students[] = new Student[2];

    public static void main(String args[]) {
        StudentMain project = new StudentMain();
        project.start();
    }

    public Student findStudentById(int id) throws InvalidIdException, StudentNotFoundException{
        if (id < 0) {
            throw new InvalidIdException("id is invalid " + id);
        }

        //for each loop
        for (Student student:students){
            if (student.getId() == id) {
                return student;
            }
        }

        throw new StudentNotFoundException("student not found for id=" + id);
    }


    public void start() {
        try {
            Course course1 = new Course("c1", "computer science");
            Course course2 = new Course("c2", "Telecom");
            System.out.println(course1);
            CseStudent cseStudent1 = new CseStudent(1, "abhishek", 70, course1, "lenovo", "java");

            displayStudent(cseStudent1);
            cseStudent1.setName("gunaditha");

            EceStudent eceStudent1 = new EceStudent(2, "suriya", 50, course2, "multimeter");
            cseStudent1.setName("abhishek nishad");// setting the value later

            students[0] = cseStudent1;
            students[1] = eceStudent1;

            int inputId = -10;
            Student student = findStudentById(inputId);
            System.out.println("student for id=" + inputId);
            displayBaseStudent(student);
        } catch (StudentNotFoundException e) {
            System.out.println("sorry student not found");
            System.out.println(e.getMessage());
        } catch (InvalidIdException e) {
            System.out.println("sorry it appears id you passed is invalid");
            String msg = e.getMessage();
            System.out.println(msg);
        } catch (Exception e) {
            System.out.println("something went wrong");
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
