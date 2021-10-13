
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String first;
        String last;
        String id;

        while (true) {
            System.out.println("First name:");
            first = scanner.nextLine();

            if(first.equals("")){
                break;
            }
            
            System.out.println("Last name:");
            last = scanner.nextLine();
            System.out.println("Identification number:");
            id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(first, last, id));

            
        }
        
        for (PersonalInformation pi : infoCollection) {
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}
