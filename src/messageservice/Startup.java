package messageservice;

/**
 * Startup is a driver for testing MessageService and various different 
 * implementations of MessageInputStrategy and MessageOutputStrategy.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageService, MessageInputStrategy, MessageOutputStrategy
 */
public class Startup {
    
    public static void main(String[] args) throws Exception {
        
        MessageInputStrategy input = new GuiInputStrategy();
        MessageOutputStrategy output = new GuiOutputStrategy();
        MessageService service = new MessageService(input, output);
        
        // Use the current Strategy
        service.outputMessage("Hello World!");
        
        // Get input from the user and output the same thing
        service.inputMessage();
        service.outputMessage("You said: " + service.getMessage());
        
        // Write a message to file and show a GUI message when done
        service.setOutputStrategy(new FileOutputStrategy("HelloWorld.txt"));
        service.outputMessage("Hello World!");
        service.setOutputStrategy(output);
        service.outputMessage("Message written to file.");
        
        // Copy the above file and show a GUI message when done
        service.outputMessage("Copying file...");
        service.setOutputStrategy(new FileOutputStrategy("HelloWorldCopy.txt"));
        service.setInputStrategy(new FileInputStrategy("HelloWorld.txt"));
        service.inputMessage();
        service.outputMessage(service.getMessage());
        service.setOutputStrategy(output);
        service.outputMessage("File copied.");
        
    }
    
}
