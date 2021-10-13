import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if(!this.jokes.isEmpty()){
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
        return "Jokes are in short supply.";
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
