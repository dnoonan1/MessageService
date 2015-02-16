package messageservice;

/**
 * HelloWorldGuiInputStrategy is a verbose name for an extension of
 * GuiIputStrategy. It uses JOptionPane to prompt the user for input, and then
 * displays the message "Hello World!", again, via JOptionPane.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         GuiInputStrategy
 */
public class HelloWorldGuiInputStrategy extends GuiInputStrategy {

    public HelloWorldGuiInputStrategy() {
        setUserPrompt("Say something - anything:");
        setMessage("Hello World!");
    }
    
}
