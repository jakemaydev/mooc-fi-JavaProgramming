
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String res1 = scan.nextLine();
        System.out.println("Give an integer:");
        int res2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double res3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean res4 = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + res1);
        System.out.println("You gave the integer " + res2);
        System.out.println("You gave the double " + res3);
        System.out.println("You gave the boolean " + res4);
    }
}
