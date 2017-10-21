package personproject;

import java.util.ArrayList;

public class Faculty extends Employee {

    private String officeHoursDays;
    private String officeHours;
    private String rank;

    public static int numOfFaculty;

    public Faculty() {

    }

    public Faculty(String firstName, String lastName, String emailAddress, Address address, ArrayList PhoneNumberArray, String officeLocation, double salary, String officeHoursDays, String officeHours, String rank) {
        super(firstName, lastName, emailAddress, address, PhoneNumberArray, officeLocation, salary);
        this.officeHoursDays = officeHoursDays;
        this.officeHours = officeHours;
        this.rank = rank;
        numOfFaculty++;

        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAddress(address);
        setPhoneNumberArray(PhoneNumberArray);
        setOfficeLocation(officeLocation);
        setSalary(salary);
    }

    public String officeHoursDays() {
        return officeHoursDays;
    }

    public String officeHours() {
        return officeHours;
    }

    public String rank() {
        return rank;
    }

    public String toString() {
        String output;

        output = super.toString() + "\nOffice Hour Days:   " + officeHoursDays + "\nOffice Hours:       " + officeHours + "\nRank:               " + rank;

        return output;
    }
}
