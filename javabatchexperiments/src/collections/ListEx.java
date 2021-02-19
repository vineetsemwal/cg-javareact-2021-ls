package collections;

import exceptionex.Product;

import java.util.*;

public class ListEx {
    public static void main(String args[]) {
        ListEx app = new ListEx();
        app.start();
    }

    public void start() {
        List<Product> list = new ArrayList<>();
        Product product2 = new Product(2, "redmi");
        list.add(product2);
        Product product1 = new Product(1, "samsung galaxy");
        list.add(product1);
        Product product4 = new Product(4, "omen");
        list.add(product4);//adding element at the end

        Product product3 = new Product(3, "iphone");
        list.add(product3);
        list.add(0,product4);// adding element at zero index
        int size = list.size();
        System.out.println("size at start=" + size);
        Product element = list.get(1);
        display(element);
        boolean exists = list.contains(product3);
        System.out.println("product3 exists=" + exists);
        list.remove(product3);//
        list.remove(3);
        exists = list.contains(product3);
        System.out.println("product3  exists after removal=" + exists);
        Comparator<Product>comparator=new ProductIdComparator();
       list.sort(comparator);
     //   Collections.sort(list);

        for (Product iteratedElement : list) {
            display(iteratedElement);
        }

    }


    public void display(Product product) {
        System.out.println("id " + product.getId() + " name " + product.getName());
    }
}
