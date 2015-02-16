package messageservice;

/**
 *
 * @author Dan Noonan
 */
public class HelloWorldGuiInputStrategy extends GuiInputStrategy {

    public HelloWorldGuiInputStrategy() {
        setUserPrompt("Say something - anything:");
        setMessage("Hello World!");
    }
    
}
