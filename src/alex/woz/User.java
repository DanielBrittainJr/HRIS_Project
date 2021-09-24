package alex.woz;
import java.time.*;

public class User {
    int id;
    String firstName, lastName, username, email, phone, location, password, currCompany, currRole;
    LocalDate bDay;
    boolean isAdmin;

    public User(int id, String firstName, String lastName, String username, String email, String phone, String location, String password, boolean isAdmin, String currRole, LocalDate bDay){
        this.id =  id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.password = password;
        this.currRole = currRole;
        this.bDay = bDay;
        this.isAdmin = isAdmin;
        this.username = username;
    }



    public void displayData(){
        System.out.println("Id:" + this.id);
        System.out.println("First Name:" + this.firstName);
        System.out.println("Last Name:" + this.lastName);
        System.out.println("Username:" + this.username);
        System.out.println("email:" + this.email);
        System.out.println("Phone:" + this.phone);
        System.out.println("Location:" + this.location);
        System.out.println("Current Role:" + this.currRole);
        System.out.println("Birth Date:" + this.bDay.toString());
        System.out.println("Is admin:" + this.isAdmin);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBDay() {
        return bDay;
    }

    public String getCurrCompany() {
        return currCompany;
    }

    public String getCurrRole() {
        return currRole;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLocation() {
        return location;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setBDay(LocalDate bDay) {
        this.bDay = bDay;
    }

    public void setCurrRole(String currRole) {
        this.currRole = currRole;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
