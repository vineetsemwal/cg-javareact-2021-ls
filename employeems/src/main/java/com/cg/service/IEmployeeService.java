package com.cg.service;

import com.cg.entities.Department;
import com.cg.entities.Employee;

import java.time.Period;
import java.util.List;
import java.util.Map;

public interface IEmployeeService {

    double totalSalaries();

    Map<String,Integer>departmentsAndCount();

    Employee findSeniormostEmployee();

    Map<Employee, Period>employeesAndDuration();

    List<Employee>employeesWithoutDepartment();

    List<Department>departmentsWithoutEmployees();

}
