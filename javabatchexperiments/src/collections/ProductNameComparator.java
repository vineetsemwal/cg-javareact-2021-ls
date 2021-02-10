package collections;

import exceptionex.Product;
import java.util.*;

public class ProductNameComparator implements Comparator<Product>{

    //
    //    int comparedVal=  comparator.compare(product1,product2)

    //
    //           string1, string2
    //       int comparedVal     =string1.compareTo(string2);
    //
    //              redmi ,samsung
    //       int comparedVal=number1.compareTo(number2);
    //
    // positive 1, negative 1, 0
    @Override
    public int compare(Product product1, Product product2) {
        String name1= product1.getName();
        String name2=product2.getName();
       int compare= name1.compareTo(name2);
       return compare;
    }
}
