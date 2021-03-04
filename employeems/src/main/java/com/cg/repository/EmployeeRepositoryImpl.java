package com.cg.repository;

import com.cg.entities.Employee;
import com.cg.exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;


@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository {

    private Map<Integer, Employee> employeeStore = StoreHolder.getInstance().getEmployeeStore();

    public int generateId() {
        int generatedId = employeeStore.size() + 1;
        return generatedId;
    }


    @Override
    public List<Employee> findAll() {
       Collection<Employee>values= employeeStore.values();
       return new ArrayList<>(values);
    }

    @Override
    public void add(Employee employee) {
        Integer id = generateId();
        employee.setEmployeeId(id);
        employeeStore.put(id, employee);
    }

    @Override
    public Employee findById(Integer id) {
       Employee employee= employeeStore.get(id);
       if(employee==null){
          throw new EmployeeNotFoundException("employee n");
       }
       return employee;
    }
}
