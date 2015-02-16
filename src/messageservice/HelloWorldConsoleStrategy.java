package messageservice;

/**
 * HelloWorldConsoleStrategy is a verbose name for an extension of
 * ConsoleStrategy. It displays a simple message--"Hello World!"--via the 
 * console.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         ConsoleStrategy
 */
public class HelloWorldConsoleStrategy extends ConsoleStrategy {

    public HelloWorldConsoleStrategy() {
        setMessage("Hello World!");
    }
    
}
