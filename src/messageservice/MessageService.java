package messageservice;

/**
 * The purpose of MessageService is to get input and write output in different
 * ways. A MessageService has a strategy for input, and another one for output.
 * 
 * @author      Monil Patel, Dan Noonan, et al.
 * @version     1.00
 * @see         MessageOutputStrategy (interface)
 */
public class MessageService {
    
    // The current input/output strategies
    private MessageInputStrategy  inputStrategy;
    private MessageOutputStrategy outputStrategy;
    private String message; // store the message from inputStrategy
    
    /* Constructors */
    
    public MessageService() {}
    
    public MessageService(MessageInputStrategy inputStrategy,
            MessageOutputStrategy outputStrategy) {
        setInputStrategy(inputStrategy);
        setOutputStrategy(outputStrategy);
    }

    /* Getters and Setters */
    
    public MessageInputStrategy getInputStrategy() {
        return inputStrategy;
    }

    public void setInputStrategy(MessageInputStrategy inputStrategy) {
        this.inputStrategy = inputStrategy;
    } 
    
    public MessageOutputStrategy getOutputStrategy() {
        return outputStrategy;
    }

    public void setOutputStrategy(MessageOutputStrategy messageStrategy) {
        this.outputStrategy = messageStrategy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    /* Misc Methods */
    
    public void inputMessage() throws Exception {
        if (inputStrategy != null) {
            message = inputStrategy.inputMessage();    
        } // null means no input
    }
    
    public void outputMessage(String message) throws Exception {
        if (outputStrategy != null) {
            outputStrategy.outputMessage(message);
        } // null means no output
    }
    
}
