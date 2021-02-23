package com.cg.repository;

import com.cg.entities.Department;
import com.cg.entities.Employee;

import java.util.HashMap;
import java.util.Map;

public class StoreHolder {

    private static final StoreHolder INSTANCE=new StoreHolder();

    private StoreHolder() {
    }

    public static StoreHolder getInstance(){
        return INSTANCE;
    }

    private Map<Integer, Employee>employeeStore=new HashMap<>();

    public Map<Integer,Employee> getEmployeeStore(){
        return employeeStore;
    }

    private Map<Integer, Department>departmentStore=new HashMap<>();

    public Map<Integer,Department>getDepartmentStore(){
        return departmentStore;
    }


}
