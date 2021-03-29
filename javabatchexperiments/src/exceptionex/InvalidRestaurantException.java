package exceptionex;

public class InvalidRestaurantException extends RuntimeException{
    public InvalidRestaurantException(String msg){
        super(msg);
    }
}
