package messageservice;

/**
 * HellowWorldConsoleInputStrategy is a verbose name for an extension of 
 * ConsoleInputStrategy. It asks the user for input and displays the message
 * "Hello World!" no matter what is entered. Both input and output are done via
 * the console.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         ConsoleInputStrategy
 */
public class HelloWorldConsoleInputStrategy extends ConsoleInputStrategy {

    public HelloWorldConsoleInputStrategy() {
        setUserPrompt("Say something - anything: ");
        setMessage("Hello World!");
    }
    
}
