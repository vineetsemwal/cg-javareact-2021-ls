package com.cg.repository;

import com.cg.entities.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee>findAll();
    void add(Employee employe);
    Employee findById(Integer id);
}
