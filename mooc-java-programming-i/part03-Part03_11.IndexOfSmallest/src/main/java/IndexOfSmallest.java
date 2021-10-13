
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 9999) {
                break;
            }

            list.add(num);
        }
        int smallest = list.get(0);
        int index = 0;

        for (int num : list) {
            if (num < smallest) {
                smallest = num;
                index = list.indexOf(num);
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);

    }
}
