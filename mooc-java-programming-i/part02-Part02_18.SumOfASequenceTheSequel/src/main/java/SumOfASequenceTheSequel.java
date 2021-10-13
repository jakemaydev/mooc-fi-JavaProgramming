
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("first number?");
        int fNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int lNum = Integer.valueOf(scanner.nextLine());

        int sum = fNum;

        for(int i = fNum+1; i <= lNum; i++){
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }
}
