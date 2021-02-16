package com.cg.schoolms.ui;

import com.cg.schoolms.entities.Student;
import com.cg.schoolms.exceptions.InvalidIdException;
import com.cg.schoolms.exceptions.InvalidScoreException;
import com.cg.schoolms.exceptions.InvalidStudentNameException;
import com.cg.schoolms.service.IStudentService;
import com.cg.schoolms.service.StudentServiceImpl;

import java.util.Collection;
import java.util.List;

public class SchoolUI {
    private IStudentService service = new StudentServiceImpl();

    public static void main(String[] args) {
        SchoolUI app = new SchoolUI();
        app.start();
    }

    public void start() {
        try {
            Student arpit = service.addStudent("arpit", 70);
            display(arpit);
            Student surya = service.addStudent("surya", 75);
            display(surya);

            Student rohit = service.addStudent("rohit", 80);
            display(rohit);

            Student fetchedStudent = service.findById(arpit.getId());
            System.out.println("**displaying fetched student for id=" + arpit.getId() + " ****");
            display(fetchedStudent);

            System.out.println("**displaying all students***");
            List<Student> list = service.findAll();
            displayAll(list);
        }catch(InvalidIdException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        catch(InvalidScoreException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }
        catch(InvalidStudentNameException e){
           System.out.println(e.getMessage());
             e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("something went wrong");
            //e.printStackTrace();
        }

    }


    public void displayAll(Collection<Student> students){
        for(Student student:students){
            display(student);
        }
    }

    public void display(Student student){
        System.out.println(student.getId()+"-"+student.getName()+"-"+"-"+ student.getScore());
    }


}
