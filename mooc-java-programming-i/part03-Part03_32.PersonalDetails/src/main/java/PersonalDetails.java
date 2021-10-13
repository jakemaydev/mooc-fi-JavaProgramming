
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sen = scanner.nextLine();
        int sum = 0;
        int total = 0;
        String name = "";

        while (!sen.equals("")) {
            String pieces[] = sen.split(",");

            for (int i = 0; i < pieces.length; i++) {
                if (i % 2 != 0) {
                    sum += Integer.valueOf(pieces[i]);
                    total++;
                } else if(i % 2 == 0) {
                    if(pieces[i].length() > name.length()){
                        name = pieces[i];
                    }
                }
            }
            sen = scanner.nextLine();
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + Double.valueOf(sum)/total);
    }
}
