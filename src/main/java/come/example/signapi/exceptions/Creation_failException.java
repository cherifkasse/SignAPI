package come.example.signapi.exceptions;

public class Creation_failException extends RuntimeException{
    private String message="FAIL";

    public Creation_failException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
