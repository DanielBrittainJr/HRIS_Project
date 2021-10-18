package alex.woz;
import java.util.Scanner;

public class Login {
    public static void display(){
        Scanner scan = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Please enter your username:");
        username = scan.nextLine();
        if(username.equals("QUIT")){
            System.exit(0);
        }

        System.out.println("Please enter your password:");
        password = scan.nextLine();
        if(password.equals("QUIT")){
            System.exit(0);
        }

        if(username.equals(Main.admin.username) && password.equals(Main.admin.password)){
            Main.currUser = Main.admin;
            System.out.println("Welcome " + Main.currUser.username + "!");
        }else if (username.equals(Main.testUser.username) && password.equals(Main.testUser.password)){
            Main.currUser = Main.testUser;
            System.out.println("Welcome " + Main.currUser.username + "!");
        } else {
            System.out.println("Username or password are incorrect!");
        }
    }
}
