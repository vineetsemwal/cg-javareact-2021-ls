package org.cg.apps.jpademo2.ui;

import org.cg.apps.jpademo2.entities.Employee;

import javax.persistence.*;
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
        Employee employee =new Employee("rohit",21);
        entityManager.persist(employee);
        Set<String> phones=new HashSet<>();
        phones.add("03676723");
        phones.add("87376764");
        phones.add("23376443");
        employee.setPhones(phones);
        transaction.commit();
        Long eid=employee.getId();
        Employee found=entityManager.find(Employee.class,eid);
        displayEmployee(found);

        Set<String>foundEmpPhones=found.getPhones();
        for (String phone:foundEmpPhones){
            System.out.println("phone="+phone);
        }
        entityManager.close();

    }

    void displayEmployee(Employee employee) {
        System.out.println("employee-" + employee.getId() + "-" + employee.getName() + "-" + employee.getAge());

    }


}
