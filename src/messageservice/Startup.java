package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan Noonan
 */
public class Startup {
    
    public static void main(String[] args) {
        
        MessageService service = new MessageService(
                new HelloWorldGuiInputStrategy()
        );
        service.showMessage();
        
    }
    
}
