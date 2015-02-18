package messageservice;

import java.io.File;
import java.io.PrintWriter;

/**
 * FileOutputStrategy is a strategy for writing a String message to a file.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageOutputStrategy
 */
public class FileOutputStrategy implements MessageOutputStrategy {

    private String fileName;
    
    public FileOutputStrategy(String fileName) {
        setFileName(fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void outputMessage(String message) throws Exception {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        pw.append(message);
        pw.close();
    }
    
}
