package messageservice;

import javax.swing.JOptionPane;

/**
 * GuiInputStrategy is a strategy for getting input from a JOptionPane input 
 * dialog window.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageInputStrategy
 */
public class GuiInputStrategy implements MessageInputStrategy {
    
    private String userPrompt = "Enter something:";

    public final String getUserPrompt() {
        return userPrompt;
    }

    public final void setUserPrompt(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("message cannot be null or the "
                    + "empty String");
        }
        userPrompt = message;
    }

    @Override
    public final String inputMessage() {
        return JOptionPane.showInputDialog(null, userPrompt);
    }
    
}
