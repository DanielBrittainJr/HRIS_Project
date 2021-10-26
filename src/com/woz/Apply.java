package com.woz;
import java.util.Scanner;
import java.time.LocalDate;

public class Apply {
    public static void display(){
        Scanner scan = new Scanner(System.in);
        String firstName, lastName, email, phone, location, password, confirmPass, username;
        LocalDate bDate;
        int bYear, bMonth, bDay;
        System.out.println("Please enter your first name:");
        firstName = scan.nextLine();
        System.out.println("Please enter your last name");
        lastName = scan.nextLine();
        System.out.println("Enter a username:");
        username = scan.nextLine();
        System.out.println("Please enter your email:");
        email = scan.nextLine();
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
        System.out.println("Please enter your birth year:");
        bYear = scan.nextInt();
        System.out.println("Please enter the number of your birth month:");
        bMonth = scan.nextInt();
        System.out.println("Please enter your birth day:");
        bDay = scan.nextInt();
        bDate = LocalDate.of(bYear, bMonth, bDay);
        Main.users++;
        User user = new User(Main.users, firstName, lastName, username, email, phone, location, password, false, bDate);
        Applicants.applicants.add(user);
        System.out.println("Thank you for your application. An admin will verify your account and then you will be able to login. You will be notified when that occurs.");
        System.exit(0);
    }
}
