
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sen = scanner.nextLine(); 

        while (!sen.equals("")) {
            String pieces[] = sen.split(" ");

            System.out.println(pieces[0]);

            sen = scanner.nextLine();
        }
    }
}
