package com.cg.apps.schoolms.ui;

import com.cg.apps.schoolms.entities.Student;
import com.cg.apps.schoolms.exceptions.*;
import com.cg.apps.schoolms.service.*;

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
            Integer arpitId=arpit.getId();
            display(arpit);
            Student surya = service.addStudent("surya", 75);
            display(surya);
            Student raja= service.addStudent("raja", 75);
            display(raja);
            Student rohit = service.addStudent("rohit", 80);
            display(rohit);

            Student fetchedStudent = service.findById(arpit.getId());
            System.out.println("**displaying fetched student for id=" + arpit.getId() + " ****");
            display(fetchedStudent);

            arpit=service.updateName(arpitId,"arpit mehta");
            System.out.println("arpit's name has been updated");
            display(arpit);

            System.out.println("display students with score 75");
            List<Student>byScoreList=service.findStudentsByScore(75);
            displayAll(byScoreList);

            System.out.println("display all");
            List<Student>all= service.findAll();
            displayAll(all);


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
           //  e.printStackTrace();
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
