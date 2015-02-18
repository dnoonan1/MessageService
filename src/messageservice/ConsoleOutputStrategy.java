package messageservice;

/**
 * ConsoleOutputStrategy is a strategy for writing a String message to the 
 * console.
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageOutputStrategy
 */
public class ConsoleOutputStrategy implements MessageOutputStrategy {

    // MessageOutputStrategy implementation
    @Override
    public final void outputMessage(String message) {
        System.out.println(message);
    }

}
