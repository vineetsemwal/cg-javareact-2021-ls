package exceptionex;

public class CheckedExceptionEx {
    public static void main(String args[]) {
        CheckedExceptionEx example = new CheckedExceptionEx();
        int ageInput = 27;
        example.isDrivingPermissible(ageInput);

    }

    public void isDrivingPermissible(int age) {
        try {
            if (age < 0 || age > 120) {
                InvalidAgeException ageException= new InvalidAgeException("age can't be " + age);
                throw ageException;
            }
            if (age >= 18) {
                System.out.println("you can drive");
            } else {
                System.out.println("you can't drive");
            }
        } catch (InvalidAgeException e) {
            System.out.println("sorry can't display information to you");
            System.out.println(e.getMessage());
        }
    }

}
