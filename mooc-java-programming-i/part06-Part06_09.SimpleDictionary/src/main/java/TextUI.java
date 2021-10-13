import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary sd;

    public TextUI(Scanner scanner, SimpleDictionary sd) {
        this.scanner = scanner;
        this.sd = sd;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String cmd = scanner.nextLine();

            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (cmd.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();

                System.out.println("Translation:");
                String translation = scanner.nextLine();

                sd.add(word, translation);
            } else if (cmd.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                if (sd.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + sd.translate(word));
                }
            }

            System.out.println("Unknown command");
        }
    }
}
