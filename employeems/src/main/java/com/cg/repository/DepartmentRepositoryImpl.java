package com.cg.repository;

import com.cg.entities.Department;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DepartmentRepositoryImpl implements IDepartmentRepository{
   private Map<Integer,Department>store=StoreHolder.getInstance().getDepartmentStore();

   public int generatedId(){
      int generatedId= store.size()+1;
      return generatedId;
   }

    @Override
    public void add(Department department) {
       int generatedId=generatedId();
       department.setDepartmentId(generatedId);
      store.put(generatedId,department);
    }

    @Override
    public Department findById(Integer id) {
        Department department= store.get(id);
        return department;
    }

    @Override
    public List<Department> findAll() {
       Collection<Department> departments=store.values();
       return new ArrayList<>(departments);
    }
}
