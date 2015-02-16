package messageservice;

/**
 * The purpose of MessageService is to display a message in different formats
 * (including console and GUI) based on the specific strategy adopted.
 * Strategies implement the simple MessageStrategy interface, allowing for a 
 * variety of behaviors. The strategy used by MessageService can be changed at
 * runtime, making it very flexible.
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageStrategy (interface)
 */
public class MessageService {
    // The current strategy
    private MessageStrategy messageStrategy;
    
    // Constructors 
    public MessageService() {}
    
    public MessageService(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    // Get current strategy
    public MessageStrategy getMessageStrategy() {
        return messageStrategy;
    }

    // Set current strategy
    public void setMessageStrategy(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }
    
    // Use the current strategy
    public void showMessage() {
        messageStrategy.showMessage();
    }
    
}
