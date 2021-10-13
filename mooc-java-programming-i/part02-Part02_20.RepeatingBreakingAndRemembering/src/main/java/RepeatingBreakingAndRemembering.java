
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        int eTotal = 0;
        int oTotal = 0;

        while (true) {
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if(num % 2 == 0){
                eTotal++;
            } else {
                oTotal++;
            }
            sum += num;
            total++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + Double.valueOf(sum)/total);
        System.out.println("Even: " + eTotal);
        System.out.println("Odd: " + oTotal);
    }
}
