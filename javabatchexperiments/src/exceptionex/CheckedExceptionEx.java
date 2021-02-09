package exceptionex;

public class CheckedExceptionEx {
    public static void main(String args[]) {
        CheckedExceptionEx example = new CheckedExceptionEx();
        int ageInput = 27;
        String nameInput = "arpit";
        try {
            example.use(ageInput, nameInput);
            //file handle 1
            //work


        } catch (InvalidAgeException e) {
            System.out.println("sorry can't display information to you as age is invalid");
            String exceptionMsg = e.getMessage();
            System.out.println(exceptionMsg);
            e.printStackTrace();
        } catch (InvalidNameException e) {
             System.out.println("sorry can't display information to you as name is invalid");
            String exceptionMsg = e.getMessage();
            System.out.println(exceptionMsg);
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
        finally{
            System.out.println("after use");
        //close handle
        }

    }

    public void use(int age, String name) throws InvalidAgeException, InvalidNameException {
        isDrivingPermissible(age, name);

    }

    public void isDrivingPermissible(int age, String name)
            throws InvalidNameException, InvalidAgeException {
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
    }


}
