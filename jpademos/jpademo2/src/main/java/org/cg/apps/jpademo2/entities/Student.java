package org.cg.apps.jpademo2.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="students_data")
public class Student {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
