package collections;

import exceptionex.Product;

import java.util.*;

public class ListEx {
    public static void main(String args[]) {
        ListEx app = new ListEx();
        app.start();
    }

    public void start() {
        List list = new ArrayList();
        Product product1 = new Product(1, "samsung galaxy");
        list.add(product1);
        Product product2 = new Product(2, "redmi");
        list.add(product2);
        Product product3 = new Product(3, "iphone");
        list.add(product3);
        Product product4 = new Product(4, "omen");
        list.add(product4);//adding element at the end
        list.add(0,product4);// adding element at zero index
        int size = list.size();
        System.out.println("size at start=" + size);
        Object element = list.get(1);
        Product product = (Product)element;
        display(product);
        boolean exists = list.contains(product3);
        System.out.println("product3 exists=" + exists);
        list.remove(product3);//
        list.remove(3);
        exists = list.contains(product3);
        System.out.println("product3  exists after removal=" + exists);

        for (Object iteratedElement : list) {
            Product iteratedElementVal = (Product) iteratedElement;
            display(iteratedElementVal);
        }

    }


    public void display(Product product) {
        System.out.println("id " + product.getId() + " name " + product.getName());
    }
}
