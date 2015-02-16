package messageservice;

/**
 * MessageStrategy is a simple interface which is intended to be used in
 * conjunction with the MessageService class. Following the Strategy Pattern, a 
 * MessageService object has a MessageStrategy, and uses the strategy by 
 * calling its only method, showMessage().
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageService
 */
public interface MessageStrategy {
    public abstract void showMessage();
}
