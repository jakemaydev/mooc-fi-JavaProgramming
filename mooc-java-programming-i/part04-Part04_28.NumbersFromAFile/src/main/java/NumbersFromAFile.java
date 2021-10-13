
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int total = 0;

        try {
            Scanner readFile = new Scanner(Paths.get(file));

            while (readFile.hasNextLine()) {
                int num = Integer.valueOf(readFile.nextLine());

                if (num <= upperBound && num >= lowerBound)
                    total++;
            }
            System.out.println("Numbers: " + total);
        } catch (Exception e) {
            System.out.println("Reading the file  " + file + " failed.");
        }
    }
}
