package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan Noonan
 */
public class GuiInputStrategy implements MessageStrategy {
    
    private String message;
    private String userPrompt = "Enter something:";
    private String userInput;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("message cannot be null or the "
                    + "empty String");
        }
    }
    
    public String getUserPrompt() {
        return userPrompt;
    }

    public void setUserPrompt(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("message cannot be null or the "
                    + "empty String");
        }
        userPrompt = message;
    }
    
    @Override
    public void showMessage() {
        userInput = JOptionPane.showInputDialog(null, userPrompt);
        JOptionPane.showMessageDialog(null, message);
    }
    
}
