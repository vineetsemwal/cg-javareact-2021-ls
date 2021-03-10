package com.cg.apps.bootschoolmswithjpa.ui;

import com.cg.apps.bootschoolmswithjpa.entities.Student;
import com.cg.apps.bootschoolmswithjpa.exceptions.InvalidIdException;
import com.cg.apps.bootschoolmswithjpa.exceptions.InvalidScoreException;
import com.cg.apps.bootschoolmswithjpa.service.IStudentService;
import com.cg.apps.bootschoolmswithjpa.exceptions.InvalidStudentNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class SchoolUI {
    @Autowired
    private IStudentService service ;


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
