package org.cg.apps.jpademo2.ui;

import org.cg.apps.jpademo2.entities.Address;
import org.cg.apps.jpademo2.entities.Employee;

import javax.persistence.*;

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
        Address address = new Address("hyderabad","oyo-1");
        entityManager.persist(address);
        Employee employee =new Employee("rohit",21,address);
        entityManager.persist(employee);
        transaction.commit();
        Long eid=employee.getId();
        Employee found=entityManager.find(Employee.class,eid);
        displayEmployee(found);
        Address foundAddress= employee.getAddress();
        displayAddress(foundAddress);
        entityManager.close();

    }

    void displayAddress(Address address){
        System.out.println("address="+address.getAddressId()+"-"+address.getCity()+"-"+address.getBuilding());
    }
    void displayEmployee(Employee employee) {
        System.out.println("student-" + employee.getId() + "-" + employee.getName() + "-" + employee.getAge());

    }


}
