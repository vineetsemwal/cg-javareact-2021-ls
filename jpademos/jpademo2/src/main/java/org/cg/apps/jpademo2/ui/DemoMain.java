package org.cg.apps.jpademo2.ui;

import org.cg.apps.jpademo2.entities.Student;

import javax.persistence.*;

public class DemoMain {
    EntityManager entityManager;

    public static void main(String args[])  {
        DemoMain demo = new DemoMain();
        demo.start();
    }


    public void start() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-ms");
        entityManager = emf.createEntityManager();
        Student mohan = new Student("mohan", 21);
        add(mohan);
        Student surya = new Student("surya", 22);
        add(surya);
        long suryaId=surya.getId();
        Student fetched=findById(suryaId);
        display(fetched);

        Student rohit=new Student("rohit",21);
        update(rohit);

        entityManager.close();

    }

    void add(Student student) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(student);
        transaction.commit();
        System.out.println("student added");
        display(student);
    }

    void update(Student student) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        student=entityManager.merge(student);
        System.out.println("student updated or inserted");
        display(student);
        transaction.commit();

    }

    void remove(Student student) {
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(student);
        transaction.commit();
        System.out.println("student removed");
        display(student);
    }

    Student findById(long id) {
        Student student = entityManager.find(Student.class, id);
        System.out.println("fetch student for id=" + id);
        return student;
    }


    void display(Student student) {
        System.out.println("student-" + student.getId() + "-" + student.getName() + "-" + student.getAge());
    }


}
