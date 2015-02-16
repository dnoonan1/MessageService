package messageservice;

/**
 *
 * @author Monil Patel, Dan Noonan, et al.
 */
public class MessageService {

    private MessageStrategy messageStrategy;

    public MessageService() {}
    
    public MessageService(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }

    public MessageStrategy getMessageStrategy() {
        return messageStrategy;
    }

    public void setMessageStrategy(MessageStrategy messageStrategy) {
        this.messageStrategy = messageStrategy;
    }
    
    public void showMessage() {
        messageStrategy.showMessage();
    }
    
}
