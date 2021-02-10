package generics;

import exceptionex.Product;

public class StoreMain {
    public static void main(String[]  args){
        Product product = new Product(1,"samsung");
        Store<Product> store = new Store(product);
        Product object =store.getValue();


    }
}
