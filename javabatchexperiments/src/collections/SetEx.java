package collections;

import exceptionex.Product;

import java.util.*;

public class SetEx {

    public static void main(String args[]) {
         SetEx app=new SetEx();
         app.start();
    }

    public void start() {
        Set<Product> set = new TreeSet<>(new ProductIdComparator());
        Product product2 = new Product(2, "redmi");
        set.add(product2);
        Product product1 = new Product(1, "samsung galaxy");
        set.add(product1);

        Product product3 = new Product(3, "iphone");
        set.add(product3);
        Product product4 = new Product(4, "omen");
        set.add(product4);//adding element at the end
        set.add(product4);
        int size = set.size();
        System.out.println("size at start=" + size);

        boolean exists = set.contains(product3);
        System.out.println("product3 exists=" + exists);
        set.remove(product3);//
        exists = set.contains(product3);
        System.out.println("product3  exists after removal=" + exists);

        for (Product iteratedElement : set) {
            display(iteratedElement);
        }

    }


    public void display(Product product) {
        System.out.println("id " + product.getId() + " name " + product.getName());
    }
}
