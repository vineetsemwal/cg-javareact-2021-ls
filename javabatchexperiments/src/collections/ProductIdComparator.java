package collections;

import exceptionex.Product;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
       int compare=p1.getId()-p2.getId();
       return compare;
    }
}
