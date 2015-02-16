package messageservice;

import javax.swing.JOptionPane;

/**
 * GuiStrategy is an implementation of the MessageStrategy interface. It
 * displays a String message via a JOptionPane window.
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageStrategy, HelloWorldGuiStrategy
 */
public class GuiStrategy implements MessageStrategy {
    
    // Message to be displayed
    private String message;

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }
    
    // MessageStrategy implementation
    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
