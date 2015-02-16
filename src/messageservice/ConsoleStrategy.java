package messageservice;

import java.util.Scanner;

/**
 * ConsoleStrategy is an implementation of the MessageStrategy interface. It 
 * displays a String message via the console.
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageStrategy, HelloWorldConsoleStrategy
 */
public abstract class ConsoleStrategy implements MessageStrategy {
    
    // Message to be displayed
    private String message;
    
    // Getter
    public final String getMessage() {
        return message;
    }

    // Setter
    public final void setMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("message cannot be null or the "
                    + "empty String");
        }
        this.message = message;
    }

    // MessageStrategy implementation
    @Override
    public final void showMessage() {
        System.out.println(message);
    }

}
