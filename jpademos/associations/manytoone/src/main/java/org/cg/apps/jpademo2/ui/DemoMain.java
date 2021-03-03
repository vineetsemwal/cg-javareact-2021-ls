package org.cg.apps.jpademo2.ui;

import org.cg.apps.jpademo2.entities.Department;
import org.cg.apps.jpademo2.entities.Employee;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DemoMain {
    EntityManager entityManager;

    public static void main(String args[]) {
        DemoMain demo = new DemoMain();
        demo.start();
    }


    public void start() {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("training-ms");
        entityManager=emf.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();


        Department dev=new Department("dev");
        entityManager.persist(dev);
        Integer devId=dev.getDeptId();


        Employee rohit =new Employee("rohit",21,dev);
        entityManager.persist(rohit);

        Employee arpit =new Employee("arpit",21,dev);
        entityManager.persist(arpit);
        Long arpitId=arpit.getId();

         Department testing=new Department("testing");
        entityManager.persist(testing);
        Integer testingId=testing.getDeptId();
        Employee nisha=new Employee("nisha",21,testing);
        Employee tanisha=new Employee("tanisha",21,testing);
        entityManager.persist(nisha);
        entityManager.persist(tanisha);
        testing=entityManager.merge(testing);

        //nisha changed the department, now she is in dev department
        nisha.setDepartment(dev);
        nisha=entityManager.merge(nisha);

        transaction.commit();
        System.out.println("employee found");

        Employee employeeFound=entityManager.find(Employee.class,arpitId);
        display(employeeFound);
        Department departmentFound=employeeFound.getDepartment();
        display(departmentFound);



        entityManager.close();

    }

    void displayEmployees(Collection<Employee> employees){
        for(Employee e:employees){
            display(e);
        }
    }
    void  display(Department department){
        System.out.println("department-"+department.getDeptId()+"-"+department.getName());
    }

    void display(Employee employee) {
        System.out.println("employee-" + employee.getId() + "-" + employee.getName() + "-" + employee.getAge());

    }


}
