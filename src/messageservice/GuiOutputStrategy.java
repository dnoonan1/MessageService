package messageservice;

import javax.swing.JOptionPane;

/**
 * GuiOutputStrategy is a strategy for outputting a String message to a 
 * JOptionPane message dialog window.
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageOutputStrategy
 */
public class GuiOutputStrategy implements MessageOutputStrategy {
    
    // MessageOutputStrategy implementation
    @Override
    public final void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
