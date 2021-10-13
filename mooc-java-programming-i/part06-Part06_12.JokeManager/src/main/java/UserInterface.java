import java.util.Scanner;

public class UserInterface {
    private JokeManager jmanager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.jmanager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String cmd = scanner.nextLine();

            if(cmd.equals("X")){
                break;
            } else if(cmd.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jmanager.addJoke(joke);
            } else if(cmd.equals("2")){
                System.out.println("Drawing a joke.");
                String drawnJoke = jmanager.drawJoke();
                System.out.println(drawnJoke);
            } else if(cmd.equals("3")){
                System.out.println("Printing the jokes.");
                jmanager.printJokes();
            }

        }
    }
}
