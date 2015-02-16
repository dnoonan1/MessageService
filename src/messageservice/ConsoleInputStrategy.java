package messageservice;

import java.util.Scanner;

/**
 *
 * @author Dan Noonan
 */
public abstract class ConsoleInputStrategy implements MessageStrategy {
    
    private static final Scanner input = new Scanner(System.in);
    private String message;
    private String userPrompt = "Enter something: ";
    private String userInput;

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

    public final void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    
    @Override
    public final void showMessage() {
        System.out.print(userPrompt);
        userInput = input.nextLine();
        System.out.println(message);
    }
    
}
