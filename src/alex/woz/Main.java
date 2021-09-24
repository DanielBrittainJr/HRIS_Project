package alex.woz;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static User user;

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (!input.equals("QUIT")){
            System.out.println("Welcome to the HRIS!");
            System.out.println("Would you like to register or login?");
            System.out.println("Enter 'register' or 'login' to login:");
            input = scan.nextLine();
            if(input.equals("register"))
                Register.display();
        }
    }
}
