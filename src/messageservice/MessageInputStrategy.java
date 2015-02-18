package messageservice;

/**
 * MessageInputStrategy is a simple interface to be implemented by classes
 * that have some way of getting String input from the user.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageService
 */
public interface MessageInputStrategy {
    public abstract String inputMessage() throws Exception;
}
