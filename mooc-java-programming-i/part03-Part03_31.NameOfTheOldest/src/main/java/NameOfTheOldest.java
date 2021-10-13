
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sen = scanner.nextLine();
        int big = 0;
        String name = "";

        while (!sen.equals("")) {
            String pieces[] = sen.split(",");

            for (int i = 0; i < pieces.length; i++) {
                if (i % 2 != 0) {
                    if (Integer.valueOf(pieces[i]) > big) {
                        big = Integer.valueOf(pieces[i]);
                        name = pieces[i - 1];
                    }
                } 
            }
            sen = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + name);
    }
}
