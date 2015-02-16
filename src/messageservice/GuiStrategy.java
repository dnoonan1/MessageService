package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Monil Patel, Dan Noonan, et al.
 */
public class GuiStrategy implements MessageStrategy {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
