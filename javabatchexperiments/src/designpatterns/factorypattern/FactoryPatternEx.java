package designpatterns.factorypattern;

import java.util.Collection;

public class FactoryPatternEx {
    CustomerFactory factory = CustomerFactory.get();


    public static void main(String[] args) {
     FactoryPatternEx example=new FactoryPatternEx();
     example.start();
    }

    public void start(){
        addCustomer(1,"rohit");
        addCustomer(2,"ajay");
        addCustomer(3,"rashi");
        Customer customer1=factory.getCustomer(1);
        Customer customer2=factory.getCustomer(2);
      //  display(customer1);
       // display(customer2);
        displayAllObjects();
    }

    public void addCustomer(int id, String name) {
        Customer customer = factory.newCustomer(id,name);
        customer.setId(id);
        customer.setName(name);
    }

    public void display(Customer customer){
        System.out.println(customer.getName()+" "+customer.getId());
    }

    public void displayAllObjects(){
       Collection<Customer> customers= factory.getCustomersMap();
       System.out.println("customers size="+customers.size());
       for (Customer customer:customers){
           display(customer);
       }
    }

}
