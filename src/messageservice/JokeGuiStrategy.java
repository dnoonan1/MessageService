package messageservice;

import java.util.Random;

/**
 * JokeGuiStrategy uses JOptionPane to display a random joke. Jokes are taken
 * from the following thread:
 * 
 * http://stackoverflow.com/questions/234075/what-is-your-best-programmer-joke
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         GuiStrategy
 */
public class JokeGuiStrategy extends GuiStrategy {

    // Random number generator for picking a random joke
    private Random random = new Random();
    // Jokes from http://stackoverflow.com/questions/234075/what-is-your-best-programmer-joke
    private String[] jokes = {
        "A SQL query walks into a bar, goes up to two tables, and says, \"Can "
            + "I join you?\"",
        "{\"hip\", \"hip\"}",
        "int getRandomNumber() {\n    return 4;\n"
            + "    // chosen by fair dice roll\n"
            + "    // guarranteed to be random\n}",
        "To understand what recursion is, you must first understand recursion."
    };
    
    public JokeGuiStrategy() {
        setMessage(getRandomJoke());
    }
    
    // Get a random element from jokes[]
    private String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
    
    // Get a new random joke, and set the message to that
    public void setNewRandomJoke() {
        setMessage(getRandomJoke());
    }
    
}
