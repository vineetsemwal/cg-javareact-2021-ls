package collections;

import exceptionex.Product;
import java.util.*;

public class ProductNameComparator implements Comparator<Product>{

    @Override
    public int compare(Product product1, Product product2) {
        String name1= product1.getName();
        String name2=product2.getName();
       int compare= name1.compareTo(name2);
       return compare;
    }
}
