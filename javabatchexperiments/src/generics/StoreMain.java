package generics;

import exceptionex.Product;
import exceptionex.ProductMain;

public class StoreMain {
    public static void main(String[]  args){
        Product product = new Product(1,"samsung");
        Store<Product> store = new Store<>(product);
        Product fetched=store.getValue();
    }
}
