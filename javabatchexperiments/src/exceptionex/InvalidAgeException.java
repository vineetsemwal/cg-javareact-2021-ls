package exceptionex;

public class InvalidAgeException extends Throwable{
    public InvalidAgeException(String msg){
        super(msg);
    }

    public InvalidAgeException(){
        super();
    }
}
