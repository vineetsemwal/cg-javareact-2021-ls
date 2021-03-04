package com.cg.service;

import com.cg.entities.Department;
import com.cg.entities.Employee;
import com.cg.exceptions.EmployeeNotFoundException;
import com.cg.repository.DepartmentRepositoryImpl;
import com.cg.repository.EmployeeRepositoryImpl;
import com.cg.repository.IDepartmentRepository;
import com.cg.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//@Component
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository ;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public double totalSalaries() {
        List<Employee> employees = employeeRepository.findAll();
        BinaryOperator<Double> operator = (sal1, sal2) -> sal1 + sal2;
        //using map transformed from Stram<Employee> to Stream<Double>
        //and then applied reduce option on Stream of salaries
        Optional<Double> optional = employees.stream().map(emp -> emp.getSalary()).reduce(operator);
        if (optional.isPresent()) {
            return optional.get();
        }
        return 0;
    }

    @Override
    public Map<String, Integer> departmentsAndCount() {
        //List<Department>depts =departmentRepository.findAll();
        List<Employee> employees = employeeRepository.findAll();
        //map of departmentname as key and employeecount as values
        Map<String, Integer> departmentMap = new HashMap<>();

        employees.stream().forEach(emp -> {
            Department department = emp.getDepartment();
            if (department != null) {
                if (departmentMap.containsKey(department.getDepartmentName())) {
                    int count = departmentMap.get(department.getDepartmentName());
                    count++;
                    departmentMap.put(department.getDepartmentName(), count);
                } else {
                    departmentMap.put(department.getDepartmentName(), 1);
                }
            }
        });

        return departmentMap;
    }

    @Override
    public Employee findSeniormostEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        Comparator<Employee> comparator = (emp1, emp2) -> {
            LocalDate hiredDate1 = emp1.getHiredDate();
            LocalDate hiredDate2 = emp2.getHiredDate();
            if (hiredDate1.isBefore(hiredDate2)) {
                return 1;
            }
            if (hiredDate1.equals(hiredDate2)) {
                return 0;
            }
            return -1;

        };
        Optional<Employee> optional = employees.stream().max(comparator);
        if (optional.isPresent()) {
            return optional.get();
        }

        throw new EmployeeNotFoundException("no employee found");
    }

    @Override
    public Map<Employee, Period> employeesAndDuration() {
        LocalDate now = LocalDate.now();
        List<Employee> employees = employeeRepository.findAll();
        Map<Employee, Period> map = new HashMap<>();
        employees.stream().forEach(emp -> {
            LocalDate hiredDate = emp.getHiredDate();
            Period period = Period.between(hiredDate, now);
            map.put(emp, period);
        });
        return map;
    }

    @Override
    public List<Employee> employeesWithoutDepartment() {
        List<Employee> employees = employeeRepository.findAll();
        Predicate<Employee> predicate = emp -> emp.getDepartment() == null;
        List<Employee> desired = employees.stream().filter(predicate).collect(Collectors.toList());
        return desired;
    }

    @Override
    public List<Department> departmentsWithoutEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        Set<Department> departmentsWithEmployees = employees.stream().filter(emp -> emp.getDepartment() != null).map(emp -> emp.getDepartment()).collect(Collectors.toSet());
        List<Department> allDepartments = departmentRepository.findAll();
        allDepartments.removeAll(departmentsWithEmployees);
        return allDepartments;
    }
}
