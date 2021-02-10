package exceptionex;

public class Product implements Comparable<Product>{

    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return  id;
    }

    @Override
    public boolean equals(Object arg){
        if(this==arg){
            return true;
        }
        if(arg==null || !(arg instanceof Product)){
            return false;
        }
        Product that = (Product)arg;
        return this.id == that.id;
    }

    @Override
    public int compareTo(Product that) {
        return this.id-that.id;
    }
}
