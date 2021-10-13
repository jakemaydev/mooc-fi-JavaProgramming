
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sen = scanner.nextLine();
        int big = 0;

        while (!sen.equals("")) {
            String pieces[] = sen.split(",");

            for (int i = 0; i < pieces.length; i++) {
                if(i % 2 != 0)
                    if (Integer.valueOf(pieces[i]) > big)
                        big = Integer.valueOf(pieces[i]);
            }
            sen = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + big);
    }
}
