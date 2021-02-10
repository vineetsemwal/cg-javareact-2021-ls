package generics;

import exceptionex.Product;

public class StoreMain {
    public static void main(String[]  args){
        Product product = new Product(1,"samsung");
        Store store = new Store(product);
        Object object =store.getValue();
        Product fetched=(Product)object;

    }
}
