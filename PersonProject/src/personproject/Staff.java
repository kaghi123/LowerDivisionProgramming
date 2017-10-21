package personproject;

import java.util.ArrayList;

public class Staff extends Employee {

    private String jobTitle;

    public static int numOfStaff;

    public Staff() {

    }

    public Staff(String firstName, String lastName, String emailAddress, Address address, ArrayList PhoneNumberArray, String officeLocation, double salary, String jobTitle) {
        super(firstName, lastName, emailAddress, address, PhoneNumberArray, officeLocation, salary);
        this.jobTitle = jobTitle;
        numOfStaff++;

        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAddress(address);
        setPhoneNumberArray(PhoneNumberArray);
        setOfficeLocation(officeLocation);
        setSalary(salary);
    }

    public String jobTitle() {
        return jobTitle;
    }

    public String toString() {
        String output;

        output = super.toString() + "\nJob Title:          " + jobTitle;

        return output;
    }
}
