package identityEquality;

public class Customer {
    private String id;
    private String name;

    public Customer(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object arg) {
        //if both object are same then return true
       if(arg==this){
           return true;
       }
       //if arg is null  or argument is not of type Customer
       if(arg==null || !(arg instanceof Customer)){
           return false;
       }

       Customer that=(Customer) arg;
       return this.id.equals(that.id);
    }
}
