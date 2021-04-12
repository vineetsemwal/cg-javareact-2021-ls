package com.cg.apps.customermsapp.customerms.service;

import java.util.List;
import java.util.Optional;

import com.cg.apps.customermsapp.customerms.dao.ICustomerRepository;
import com.cg.apps.customermsapp.customerms.entities.Customer;
import com.cg.apps.customermsapp.customerms.exceptions.InvalidCustomerNameException;
import com.cg.apps.customermsapp.customerms.exceptions.CustomerNotFoundException;
import com.cg.apps.customermsapp.customerms.util.CustomerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository repository;

    @Autowired
    private CustomerUtil util;


    @Override
    public Customer findById(int id) {
        repository.existsById(id);
        Optional<Customer> optional = repository.findById(id);
        if (!optional.isPresent()) {
            throw new CustomerNotFoundException("customer doesn't exist for id=" + id);
        }
        return optional.get();
    }


    @Override
    public Customer addStudent(String name, int age, String address) {
        validateName(name);
        Customer customer = util.newStudent();
        customer.setName(name);
        customer.setAddress(address);
        customer.setAge(age);
        customer = repository.save(customer);
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = repository.findAll();
        return customers;
    }

    @Override
    public Customer updateName(int id, String name) {
        validateName(name);
        Customer customer = findById(id);
        customer.setName(name);
        customer = repository.save(customer);
        return customer;
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    void validateName(String name) {
        if (name == null || name.isEmpty() || name.trim().isEmpty()) {
            throw new InvalidCustomerNameException("name can't be null or empty");
        }
    }

}
