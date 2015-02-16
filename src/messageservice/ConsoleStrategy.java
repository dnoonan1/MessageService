package messageservice;

import java.util.Scanner;

/**
 *
 * @author Monil Patel, Dan Noonan, et al.
 */
public abstract class ConsoleStrategy implements MessageStrategy {
    
    private String message;
    
    public final String getMessage() {
        return message;
    }

    public final void setMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("message cannot be null or the "
                    + "empty String");
        }
        this.message = message;
    }

    @Override
    public final void showMessage() {
        System.out.println(message);
    }

}
