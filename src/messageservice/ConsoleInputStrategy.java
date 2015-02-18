package messageservice;

import java.util.Scanner;

/**
 * ConsoleInputStrategy is a strategy for getting input from the console.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageInputStrategy
 */
public class ConsoleInputStrategy implements MessageInputStrategy {
    
    // Scanner for console input
    private static final Scanner input = new Scanner(System.in);
    // Message shown to user when prompted for input
    private String userPrompt = "Enter something: ";

    /* Getters and Setters */
    
    public final String getUserPrompt() {
        return userPrompt;
    }

    public final void setUserPrompt(String userPrompt) {
        if (userPrompt == null || userPrompt.isEmpty()) {
            throw new IllegalArgumentException("userPrompt cannot be null or "
                    + "an empty String");
        }
        this.userPrompt = userPrompt;
    }
    
    @Override
    public final String inputMessage() {
        return input.nextLine();
    }
    
}
