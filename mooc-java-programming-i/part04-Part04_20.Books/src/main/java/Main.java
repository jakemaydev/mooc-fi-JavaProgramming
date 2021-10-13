import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter
        // book information and to examine them
        String title;
        int pages;
        int releaseYear;

        while (true) {
            System.out.println("Title:");
            title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.println("Pages:");
            pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            releaseYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, releaseYear));
        }

        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        for (Book b : books) {
            if (info.equals("everything")) {
                System.out.println(b.toStringEverything());
            } else if(info.equals("name")){
                System.out.println(b.toStringTitle());
            }
        }
    }
}
