package exception.customException;

    // Custom Checked Exception
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);  // Calling parent constructor
        }
    }

    public class CustomCheckedException {
        public static void main(String[] args) {
            try {
                checkAge(15);
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above!");
            }
            System.out.println("Eligible to vote.");
        }
    }

