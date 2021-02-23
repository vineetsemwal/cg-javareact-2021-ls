package com.cg.repository;

import com.cg.entities.Department;

import java.util.*;

public interface IDepartmentRepository {
    void add(Department department);

    Department findById(Integer id);

    List<Department> findAll();
}
