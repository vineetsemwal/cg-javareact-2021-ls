package student.ui;

import student.beans.*;
import student.exceptions.InvalidIdException;
import student.exceptions.StudentNotFoundException;

import java.util.*;

public class StudentMain {

    private Map<Integer,Student> store = new HashMap<>();

    public static void main(String args[]) {
        StudentMain project = new StudentMain();
        project.start();
    }



    public void start() {
        try {
            Course course1 = new Course("c1", "computer science");
            Course course2 = new Course("c2", "Telecom");
            System.out.println(course1);
            addCseStudent(1,"arpit",80,course1,"omen","java");
            addCseStudent(2,"abeer",70,course2,"lenovo","C#");

            addEceStudent(3, "suriya", 50, course2, "multimeter");
            addEceStudent(4,"abhishek",90,course2,"electric tester");

            int inputId = 1;
            Student student = findStudentById(inputId);
            System.out.println("student for id=" + inputId);

            if(student instanceof EceStudent){
                EceStudent eceStudent=(EceStudent)student;
                displayStudent(eceStudent);
            }
            if(student instanceof CseStudent){
                CseStudent cseStudent=(CseStudent)student;
                displayStudent(cseStudent);
            }

            displayAll();


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

    public void displayAll(){
        System.out.println("*****display all student*******");
        Collection<Student>students=store.values();
        for(Student student:students){
            if(student instanceof EceStudent){
                EceStudent eceStudent=(EceStudent)student;
                displayStudent(eceStudent);
            }
            if(student instanceof CseStudent){
                CseStudent cseStudent=(CseStudent)student;
                displayStudent(cseStudent);
            }
        }
    }


    public void addEceStudent(int id, String name, int score,Course course, String device)
    {
        EceStudent student = new EceStudent(id, name, score, course, device);
        store.put(id,student);
    }


    public void addCseStudent(int id, String name, int score,Course course, String laptop, String lang)
    {
        CseStudent student = new CseStudent(id, name, score,course, laptop, lang);
        store.put(id,student);

    }

    public Student findStudentById(int id) throws InvalidIdException, StudentNotFoundException{
        if (id < 0) {
            throw new InvalidIdException("id is invalid " + id);
        }
        if(!store.containsKey(id)){
            throw new StudentNotFoundException("student not found for id=" + id);
        }
        Student student=store.get(id);
        return student;
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
