package exceptionex;


public class ProductMain {

    public static void main(String[] args) {
        ProductMain app = new ProductMain();
        Product product =null;
        app.displayUsed(product);
        System.out.println("bye, see you");

    }

    void displayUsed(Product product){
        display(product);
    }

    void display(Product product) {
            System.out.println("inside display, before product details are to be displayed");
            System.out.println("product=" + product.getId() + " -" + product.getName());
            System.out.println("product details are displayed");
    }


}
