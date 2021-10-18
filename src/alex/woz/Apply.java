package alex.woz;
import java.util.Scanner;
import java.time.LocalDate;

public class Apply {
    enum Month {JAN, FEB, MAR, APR, MAY, JUN,
        JUL, AUG, SEP, OCT, NOV, DEC};
    public static void display(){
        Scanner scan = new Scanner(System.in);
        String firstName, lastName, email, phone, location, password, confirmPass, currRole, username;
        LocalDate bDate;
        boolean isAdmin;
        int bYear, bMonth, bDay;
        System.out.println("Please enter your first name:");
        firstName = scan.nextLine();
        System.out.println("Please enter your last name");
        lastName = scan.nextLine();
        System.out.println("Please enter your email:");
        email = scan.nextLine();
        System.out.println("Please enter an username:");
        username = scan.nextLine();
        System.out.println("Please enter a password:");
        password = scan.nextLine();
        System.out.println("Please confirm your password:");
        confirmPass = scan.nextLine();
        while(!password.equals(confirmPass)){
            System.out.println("Passwords need to match, try again:");
            System.out.println("Please enter a password:");
            password = scan.nextLine();
            System.out.println("Please confirm your password:");
            confirmPass = scan.nextLine();
        }
        System.out.println("Please enter you phone number");
        phone = scan.nextLine();
        System.out.println("Please enter your location:");
        location = scan.nextLine();
        System.out.println("Enter your current role:");
        currRole = scan.nextLine();
        System.out.println("Please enter your birth year:");
        bYear = scan.nextInt();
        System.out.println("Please enter the first three letters of your birth month:");
        bMonth = Month.valueOf(scan.nextLine().toUpperCase()).ordinal();
        System.out.println("Please enter your birth day:");
        bDay = scan.nextInt();
        bDate = LocalDate.of(bYear, bMonth, bDay);
    }
}
