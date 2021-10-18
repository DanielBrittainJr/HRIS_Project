package alex.woz;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static User currUser;
    static User admin = new User(1, "N/A", "N/A", "Admin", "email@site.com", "(123)456-7890", "USA", "password", true, "Admin", LocalDate.of(2021, 1,1));
    static User testUser = new User(1, "N/A", "N/A", "User", "email@site.com", "(123)456-7890", "USA", "password", false, "Admin", LocalDate.of(2021, 1,1));
    static String input = "";
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        while (!input.equals("QUIT")){
            while (currUser == null) {
                System.out.println("Welcome to the McMillian and Associates HRIS!");
                System.out.println("Are you currently a McMillian employee? Please enter 'yes' or 'no' to continue or enter 'QUIT' to exit the program at any time");
                input = scan.nextLine().toLowerCase();
                System.out.println(input);
                if (input.equals("yes")) {
                    Login.display();
                } else {
                    System.out.println("Would you like to apply for a job? Please enter 'yes' or 'no'");
                    input = scan.nextLine();
                }
            }
        }
    }
}
