package messageservice;

/**
 * HelloWorldGuiStrategy is a verbose name for an extension of GuiStrategy. It
 * displays "Hello World!" via JOptionPane.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         GuiStrategy
 */
public class HelloWorldGuiStrategy extends GuiStrategy {

    public HelloWorldGuiStrategy() {
        setMessage("Hello World!");
    }
    
}
