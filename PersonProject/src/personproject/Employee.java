package personproject;

import java.util.ArrayList;

public class Employee extends Person {

    private String officeLocation;
    private double salary;

    public static int numOfEmployee;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailAddress, Address address, ArrayList PhoneNumberArray, String officeLocation, double salary) {
        super(firstName, lastName, emailAddress, address, PhoneNumberArray);
        this.officeLocation = officeLocation;
        this.salary = salary;
        numOfEmployee++;

        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAddress(address);
        setPhoneNumberArray(PhoneNumberArray);
    }

    public String officeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public double salary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        String output;

        output = super.toString() + "\nOffice Location:    " + officeLocation + "\nSalary:             $" + salary;

        return output;
    }
}
