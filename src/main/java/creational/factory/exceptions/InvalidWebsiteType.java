package creational.factory.exceptions;

public class InvalidWebsiteType extends Exception {

    public InvalidWebsiteType(String message) {
        super(message);
    }

    public InvalidWebsiteType(String message, Throwable cause) {
        super(message, cause);
    }
}
