import UI.UserInterface;
import Wrapper.*;

import java.sql.SQLException;

//current working prototype
public class Main {
    public static void main(String[] args) {

        //this is the body of code needed in main for the basic program to run
        UserInterface UI = new UserInterface();
        try {
            UI.initGreeting(); //we greet user and take their information
            UI.userPage(); //here we load information to the user based on their selection
            //after they make their selection we run a sql query that will grab the information they wanted for display
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // So currently our prototype greets a user, takes their name and password and depending on what they select, queries the database returning information.
    //focus on readability and maintainability for future iterations and feature additions.
    //this allows for rapid future development and easier onboarding for future developers

    // each class/group of classes are contained in packages such as 'Wrapper' and 'UI' etc

    //I spent a good amount of time creating a wrapper for the jdbc so we can query without having to worry about so much of the internals.
    //We have a few things on our to do list on top of fleshing out the prototype that includes
    //TODO making the UX better by making the design better and prettier
    //TODO Getting the mock database filled with correct data so it can be queried
    //TODO Creating more default queries to be used within the default query class for ease of use
    //TODO create separation between user and admin such that user can only see themselves
    //TODO *CREATE/UPDATE DOCUMENTATION*
    //TODO etc.
    //The prototype displays how we can allow the user to see information on themselvess and on others.
    //
    //Roughly the prototype shows the process for how we will further add the needed features to complete the project.
}


