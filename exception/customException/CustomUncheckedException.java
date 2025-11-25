package exception.customException;


    // Custom Unchecked Exception
    class InvalidAmountException extends RuntimeException {
        public InvalidAmountException(String msg) {
            super(msg);
        }
    }

    public class CustomUncheckedException {
        public static void main(String[] args) {
            withdraw(-100);
        }

        static void withdraw(int amount) {
            if (amount < 0) {
                throw new InvalidAmountException("Amount cannot be negative!");
            }
            System.out.println("Withdraw Successful!");
        }
    }

