package com.cg.apps.customermsapp.customerms.service;

import com.cg.apps.customermsapp.customerms.entities.Customer;


import java.util.List;

public interface ICustomerService {

    Customer addStudent(String name, int age, String address);

    Customer findById(int id);

    List<Customer> findAll();

    Customer updateName(int id, String name);

    void deleteById(int id);

}
