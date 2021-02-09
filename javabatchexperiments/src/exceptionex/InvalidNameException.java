package exceptionex;

public class InvalidNameException extends Throwable{

    public InvalidNameException(){
    }

    public InvalidNameException(String msg){
        super(msg);
    }

}
