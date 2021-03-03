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
        Employee rohit =new Employee("rohit",21);
        entityManager.persist(rohit);

        Employee arpit =new Employee("arpit",21);
        entityManager.persist(arpit);

        Set<Employee> devEmployees=new HashSet<>();
        devEmployees.add(rohit);
        devEmployees.add(arpit);

        Department dev=new Department("dev",devEmployees);
        entityManager.persist(dev);
        Integer devId=dev.getDeptId();

         Department testing=new Department("testing",null);
        entityManager.persist(testing);
        Integer testingId=testing.getDeptId();
        Employee nisha=new Employee("nisha",21);
        Employee tanisha=new Employee("tanisha",21);
        entityManager.persist(nisha);
        entityManager.persist(tanisha);
        Set<Employee>testingEmployees=new  HashSet<>();
        testingEmployees.add(nisha);
        testingEmployees.add(tanisha);
        testing.setEmployees(testingEmployees);
        testing=entityManager.merge(testing);

        transaction.commit();

        System.out.println("dev department found");
        Department devFound=entityManager.find(Department.class,devId);
        display(devFound);
        Set<Employee>devFoundEmployees=devFound.getEmployees();
        displayEmployees(devFoundEmployees);

        System.out.println("testing department found");
        Department testingFound=entityManager.find(Department.class,testingId);
        Set<Employee>testingFoundEmployees=testingFound.getEmployees();
        display(testingFound);
        displayEmployees(testingFoundEmployees);
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
