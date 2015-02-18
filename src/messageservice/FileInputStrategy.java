package messageservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * FileInputStrategy is a strategy for getting input from a file.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         MessageInputStrategy
 */
public class FileInputStrategy implements MessageInputStrategy {

    private String fileName;

    public FileInputStrategy(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public String inputMessage() throws FileNotFoundException {
        File file = new File(fileName);
        if (file.exists()) {
            Scanner input = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (input.hasNext()) {
                sb.append(input.next());
            }
            input.close();
            return sb.toString();
        }
        return null;
    }
    
}
