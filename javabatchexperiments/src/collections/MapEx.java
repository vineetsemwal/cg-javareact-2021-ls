package collections;

import exceptionex.Product;

import java.util.*;

public class MapEx {

    public static void main(String[] args) {
        MapEx app = new MapEx();
        app.start();
    }

    public void start() {
        Map<Integer, Product> map = new HashMap<>();
        Product product1 = new Product(1, "samsung");
        Product product2 = new Product(2, "redmi");
        Product product3 = new Product(3, "lenovo");
        map.put(1, product1);
        map.put(2, product2);
        map.put(3, product3);
        map.put(4, product2);
        boolean keyExists = map.containsKey(2);
        System.out.println("key 2 exists ?"+keyExists);
        boolean valueExist = map.containsValue(product1);
        Product fetchedProduct = map.get(2);
        System.out.println("displaying product with key 2");
        display(fetchedProduct);
        Set<Integer> keys = map.keySet();
        System.out.println("iterating on the keys and fetching values");
        for(Integer key:keys){
           Product product= map.get(key);
           display(product);
        }
        System.out.println("iterating on values and displaying them");
       Collection<Product>values= map.values();
       for(Product product:values){
          display(product);
       }

    }

    public void display(Product product) {
        System.out.println("id " + product.getId() + " name " + product.getName());
    }

}
