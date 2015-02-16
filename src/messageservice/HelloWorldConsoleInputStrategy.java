package messageservice;

/**
 *
 * @author Dan Noonan
 */
public class HelloWorldConsoleInputStrategy extends ConsoleInputStrategy {

    public HelloWorldConsoleInputStrategy() {
        setUserPrompt("Say something - anything: ");
        setMessage("Hello World!");
    }
    
}
