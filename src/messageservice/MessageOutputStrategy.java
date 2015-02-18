package messageservice;

/**
 * MessageOutputStrategy is a simple interface to be implemented by classes
 * that have some way of outputting a String message.
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageService
 */
public interface MessageOutputStrategy {
    public abstract void outputMessage(String message) throws Exception;
}
