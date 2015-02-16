package messageservice;

import java.util.Scanner;

/**
 * ConsoleInputStrategy is an implementation of the MessageStrategy interface.
 * Like ConsoleStrategy, it uses the console to output a String message. In 
 * addition, it allows for console input.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageStrategy, ConsoleStrategy, HelloWorldConsoleInputStrategy
 */
public abstract class ConsoleInputStrategy implements MessageStrategy {
    
    // Scanner for console input
    private static final Scanner input = new Scanner(System.in);
    // Message to be displayed
    private String message;
    // Message shown to user when prompted for input
    private String userPrompt = "Enter something: ";
    // Input entered by user after prompt
    private String userInput;

    /* Getters and Setters */
    
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
    
    public final String getUserPrompt() {
        return userPrompt;
    }

    public final void setUserPrompt(String userPrompt) {
        if (userPrompt == null || userPrompt.isEmpty()) {
            throw new IllegalArgumentException("userPrompt cannot be null or "
                    + "the empty String");
        }
        this.userPrompt = userPrompt;
    }

    public final String getUserInput() {
        return userInput;
    }
    
    // MessageStrategy implementation
    @Override
    public final void showMessage() {
        System.out.print(userPrompt);
        userInput = input.nextLine();
        System.out.println(message);
    }
    
}
