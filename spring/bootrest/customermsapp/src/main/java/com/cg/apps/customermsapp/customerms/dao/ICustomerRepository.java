package com.cg.apps.customermsapp.customerms.dao;


import com.cg.apps.customermsapp.customerms.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
