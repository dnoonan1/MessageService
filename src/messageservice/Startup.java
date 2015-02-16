package messageservice;

import javax.swing.JOptionPane;

/**
 * Startuup is a driver for testing MessageService and various different 
 * implementations of MessageStrategy.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageService, MessageStrategy
 */
public class Startup {
    
    public static void main(String[] args) {
        
        MessageService service = new MessageService(
                new JokeGuiStrategy()
                /*
                   Can use any of the following:
                     1. HelloWorldConsoleStrategy
                     2. HelloWorldConsoleInputStrategy
                     3. HelloWorldGuiStrategy
                     4. HelloWorldGuiInputStrategy
                     5. JokeConsoleStrategy
                     6. JokeConsoleInputStrategy
                */
        );
        // Can use service.setMessageStrategy() to change strategies
        
        // Use the current Strategy
        service.showMessage();
        
    }
    
}
