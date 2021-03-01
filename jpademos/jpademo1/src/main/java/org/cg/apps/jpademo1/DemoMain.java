package org.cg.apps.jpademo1;

import org.cg.apps.jpademo1.entities.Employee;

import javax.persistence.*;

public class DemoMain {
    public static void main(String args[]) {
        DemoMain demo = new DemoMain();
        demo.start();
    }
    EntityManager entityManager ;

    public void start() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-ms");
        entityManager= emf.createEntityManager();
        Employee yash=new Employee("yash",21);
        add(yash);
        Employee mohan=new Employee("mohan",22);
        add(mohan);
        Integer mohanId= mohan.getId();
        Employee surya=new Employee("surya",23);
        add(surya);

        Employee fetched=findById(mohanId);
        display(fetched);

        delete(surya);




    }

    public void add(Employee employee){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();
        System.out.println("employee added");
        display(employee);
    }

    public void update(Employee employee){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        //entityManager.persist(employee);
        transaction.commit();
        System.out.println("employee updated");
        display(employee);
    }

    public Employee findById(int id){
      Employee employee=  entityManager.find(Employee.class,id);
      System.out.println("employee fetched");
      display(employee);
      return employee;
    }

    public void delete(Employee employee){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(employee);
        transaction.commit();
        System.out.println("employee deleted");
        display(employee);
    }

    public void display(Employee employee) {
        System.out.println("employee--" + employee.getId() + " -" + employee.getName() + "-" + employee.getAge());
    }


}
