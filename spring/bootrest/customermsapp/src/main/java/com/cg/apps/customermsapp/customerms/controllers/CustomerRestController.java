package com.cg.apps.customermsapp.customerms.controllers;

import com.cg.apps.customermsapp.customerms.dto.ChangeNameRequest;
import com.cg.apps.customermsapp.customerms.dto.CreateCustomerRequest;
import com.cg.apps.customermsapp.customerms.dto.DeleteCustomerRequest;
import com.cg.apps.customermsapp.customerms.dto.CustomerDetails;
import com.cg.apps.customermsapp.customerms.entities.Customer;
import com.cg.apps.customermsapp.customerms.service.ICustomerService;

import java.util.List;

import com.cg.apps.customermsapp.customerms.util.CustomerUtil;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/customers")
@RestController
public class CustomerRestController {

    private static final Logger LOG=LoggerFactory.getLogger(CustomerRestController.class);

    @Autowired
    private ICustomerService service;

    @Autowired
    private CustomerUtil util;

    /**
     * /students/byid/2
     */
    //@RequestMapping(value="/byid/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/byid/{id}")
    public CustomerDetails fetchCustomer(@PathVariable("id") Integer studentId) {
        Customer customer = service.findById(studentId);
        CustomerDetails details=util.toDetails(customer);
        return details;
    }


    /**
     * /students
     */
    @GetMapping
    public List<CustomerDetails> allCustomers() {
        List<Customer> list = service.findAll();
        List<CustomerDetails>desired=util.toDetailsList(list);
        return desired;
    }

    /**
     * in post request ,data is sent as part of request body
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public CustomerDetails addCustomer(@RequestBody CreateCustomerRequest requestData) {
        Customer created = service.addStudent(requestData.getName(), requestData.getAge(), requestData.getAddress());
        CustomerDetails details = util.toDetails(created);
        return details;
    }

    @PutMapping("/changename")
    public CustomerDetails changeName(@RequestBody ChangeNameRequest requestData) {
        Customer customer = service.updateName(requestData.getId(), requestData.getName());
        CustomerDetails desired=util.toDetails(customer);
        return desired;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody DeleteCustomerRequest requestData){
        service.deleteById(requestData.getId());
        return "customer deleted for id="+requestData.getId();
    }



}
