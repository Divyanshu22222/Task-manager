class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class main {
    
    public static void checkValue(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Value cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            int value = -5;
            checkValue(value);
        } catch (MyCustomException e) {
           
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}