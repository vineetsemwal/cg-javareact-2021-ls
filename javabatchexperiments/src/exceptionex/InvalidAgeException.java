package exceptionex;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String msg) {
        super(msg);
    }

    public InvalidAgeException() {
        super();
    }
}
