// Custom Exception Class
public class InvalidDataException extends Exception {

    // Constructor
    public InvalidDataException(String msg) {
        super(msg);
    }

    // Method to validate input
    static void check(int age) throws InvalidDataException {
        if (age < 18) {
            throw new InvalidDataException("Age must be 18 or above");
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        try {
            check(15);  // test case
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }
}