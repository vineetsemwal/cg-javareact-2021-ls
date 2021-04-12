package com.cg.apps.customermsapp.customerms.ui;

import com.cg.apps.customermsapp.customerms.entities.Customer;
import com.cg.apps.customermsapp.customerms.exceptions.InvalidIdException;
import com.cg.apps.customermsapp.customerms.service.ICustomerService;
import com.cg.apps.customermsapp.customerms.exceptions.InvalidCustomerNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class CustomerUI {
    @Autowired
    private ICustomerService service ;


    public void start() {
        try {
            Customer arpit = service.addStudent("arpit", 21,"chennai");
            display(arpit);
            Customer surya = service.addStudent("surya", 22, "bangalore");
            display(surya);

            Customer rohit = service.addStudent("rohit", 23,"mumbai");
            display(rohit);

            Customer fetchedCustomer = service.findById(arpit.getId());
            System.out.println("**displaying fetched customer for id=" + arpit.getId() + " ****");
            display(fetchedCustomer);

            System.out.println("**displaying all customers***");
            List<Customer> list = service.findAll();
            displayAll(list);
        }catch(InvalidIdException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        catch(InvalidCustomerNameException e){
           System.out.println(e.getMessage());
           //  e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("something went wrong");
            //e.printStackTrace();
        }

    }


    public void displayAll(Collection<Customer> customers){
        for(Customer customer : customers){
            display(customer);
        }
    }

    public void display(Customer customer){
        System.out.println(customer.getId()+"-"+ customer.getName()+"-"+"-"+ customer.getAge()+" -"+customer.getAddress());
    }


}
