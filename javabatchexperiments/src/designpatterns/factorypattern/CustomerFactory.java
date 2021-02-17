package designpatterns.factorypattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerFactory {

    private static final CustomerFactory factory = new CustomerFactory();

    public static final CustomerFactory get() {
        return factory;
    }

    private CustomerFactory() {

    }

    private Map<Integer, Customer> customersMap = new HashMap<>();

    public Customer newCustomer(int id, String name) {
        Customer customer = factory.newCustomer(id,name);//new Customer()
        customer.setId(id);
        customer.setName(name);
        customersMap.put(id, customer);
        return customer;
    }

    public Customer getCustomer(int id){
        return customersMap.get(id);
    }

    public List<Customer> getCustomersMap(){
        return new ArrayList<>(customersMap.values());
    }

}
