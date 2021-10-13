
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int fNum = Integer.valueOf(scanner.nextLine());

        int fac = 1;

        for(int i = 1; i <= fNum; i++){
            fac *= i;
        }

        System.out.println("Factorial: " + fac);
    }
}
