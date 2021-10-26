package com.woz;
import java.util.ArrayList;
import java.util.Scanner;

public class Applicants {
    static ArrayList<User> applicants;
    public static void display(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Current applicants:");
        for (User u : applicants) {
            System.out.println(u.getFullName());
        }
        System.out.println("Enter the first and last name of the user you want to see or enter 'RETURN' to go back:");
        Main.input = scan.nextLine();
        if(Main.input.equals("RETURN")){
            AdminScreen.display();
        }else {
            displayApplicant(Main.input);
        }
    }

    public static void displayApplicant(String name){
        Scanner scan = new Scanner(System.in);
        boolean found = false;
        for(User u : applicants){
            if(u.getFullName().equals(name)){
                found = true;
                u.displayData();
                System.out.println("Verify user? Enter 'yes' or 'no': ");
                Main.input = scan.nextLine();
                if(Main.input.equals("yes")) Main.allUsers.add(u);
                applicants.remove(u);
            }
        }
        if(!found){
            System.out.println("There doesn't appear to be any applicant with that name.");
        }
    }
}
