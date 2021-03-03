package org.cg.apps.jpademo2.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Table(name ="departments_data")
@Entity
public class Department {

    @GeneratedValue
    @Id
    private Integer deptId;

    private String name;


    public Department(){

    }

    public Department(String name){
        this.name = name;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(deptId, that.deptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId);
    }
}
