package exception;

public class SubhamException extends RuntimeException {

    public SubhamException() {
        super("Subham Exception");
    }

    public SubhamException(String message) {
        super(message);
    }

}
