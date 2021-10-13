
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;


        try(Scanner readFile = new Scanner(Paths.get(file))){
            while(readFile.hasNextLine()){
                String parts[] = readFile.nextLine().split(",");

                if(parts[0].equals(team)){
                    games++;

                    if(Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])){
                        wins++;
                    } else {
                        losses++;
                    }
                } else if(parts[1].equals(team)){
                    games++;

                    if(Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])){
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
