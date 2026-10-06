package exception;

public class AgeTest {

    public static void main(String[] args) {
        try {
            checkAge(20);   // valid
            checkAge(15);   // throws AgeException
            checkAge(30);   // never reached
        } catch (AgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Age check finished.");
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above. You entered: " + age);
        }
        System.out.println("Age " + age + " is valid. Access granted.");
    }
}