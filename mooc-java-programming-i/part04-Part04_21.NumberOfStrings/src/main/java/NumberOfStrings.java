
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while(true){
            if(!scanner.nextLine().equals("end")){
                total++;
            } else {
                break;
            }
        }

        System.out.println(total);
    }
}
