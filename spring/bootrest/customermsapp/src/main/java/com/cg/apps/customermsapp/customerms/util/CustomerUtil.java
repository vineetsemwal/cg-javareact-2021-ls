package com.cg.apps.customermsapp.customerms.util;

import com.cg.apps.customermsapp.customerms.dto.CustomerDetails;
import com.cg.apps.customermsapp.customerms.entities.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CustomerUtil {

    public Customer newStudent(){
        return new Customer();
    }

    public CustomerDetails toDetails(Customer customer){
        CustomerDetails details=new CustomerDetails();
        details.setId(customer.getId());
        details.setName(customer.getName());
        details.setAge(customer.getAge());
        details.setAddress(customer.getAddress());
        return details;
    }


    public List<CustomerDetails> toDetailsList(Collection<Customer> customers){
        List<CustomerDetails>desired=new ArrayList<>();
        for (Customer customer : customers){
            CustomerDetails details=toDetails(customer);
            desired.add(details);
        }
        return desired;

    }


    /*
    public List<StudentDetails>toDetails(Collection<Student> students){
      List<StudentDetails>desired=  students.stream().map(student->toDetails(student)).collect(Collectors.toList());
      return  desired;
    }
    */

}
