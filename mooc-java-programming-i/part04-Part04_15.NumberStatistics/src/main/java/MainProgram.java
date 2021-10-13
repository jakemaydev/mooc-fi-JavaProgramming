
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        int num = 0;
        Statistics s = new Statistics();
        Statistics sE = new Statistics();
        Statistics sO = new Statistics();

        System.out.println("Enter numbers:");

        while(num != -1){
            num = Integer.valueOf(scanner.nextLine());
            if(num != -1){
                s.addNumber(num);
                s.sum();

                if(num % 2 == 0){
                    sE.addNumber(num);
                } else if(num % 2 != 0){
                    sO.addNumber(num);
                }

                sE.sum();
                sO.sum();
            }
        }

        System.out.println("Sum: " + s.sum());
        System.out.println("Sum of even numbers: " + sE.sum());
        System.out.println("Sum of odd numbers: " + sO.sum());
    }
}
