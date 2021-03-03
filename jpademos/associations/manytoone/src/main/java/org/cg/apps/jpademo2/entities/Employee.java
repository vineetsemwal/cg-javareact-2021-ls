package org.cg.apps.jpademo2.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="employees_data")
public class Employee {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private int age;
    @ManyToOne
    private Department department;


    public Employee(){

    }

    public Employee(String name, int age, Department department){
        this.name=name;
        this.age=age;
        this.department=department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
