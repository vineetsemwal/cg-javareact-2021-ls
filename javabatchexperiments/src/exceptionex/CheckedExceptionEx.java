package exceptionex;

public class CheckedExceptionEx {
    public static void main(String args[]) {
        CheckedExceptionEx example = new CheckedExceptionEx();
        int ageInput = 27;
        String nameInput = "";
        example.isDrivingPermissible(ageInput, nameInput);

    }

    public void isDrivingPermissible(int age, String name) {
        try {
            if (age < 0 || age > 120) {
                InvalidAgeException ageException = new InvalidAgeException("age can't be " + age);
                throw ageException;
            }

            if (name == null || name.isEmpty()) {
                throw new InvalidNameException("name can't be null or empty");
            }

            if (age >= 18) {
                System.out.println(name + ", you can drive");
            } else {
                System.out.println(name + ", you can't drive");
            }
        } catch (InvalidAgeException e) {
            System.out.println("sorry can't display information to you as age is invalid");
            String exceptionMsg = e.getMessage();
            System.out.println(exceptionMsg);
        } catch (InvalidNameException e) {
            System.out.println("sorry can't display information to you as name is invalid");
            String exceptionMsg = e.getMessage();
            System.out.println(exceptionMsg);
        }
    }

}
