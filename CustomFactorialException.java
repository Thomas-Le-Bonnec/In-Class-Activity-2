public class CustomFactorialException extends Exception {
    public CustomFactorialException() {
        super("CustomFactorialException: Input is out of range (1 to 10)");
    }

    public CustomFactorialException(String message) {
        super(message);
    }
}
