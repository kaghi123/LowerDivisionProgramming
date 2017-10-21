package personproject;

import java.util.ArrayList;

public class Student extends Person {

    private String classStanding;
    public static int numOfStudents;

    public Student() {

    }

    public Student(String firstName, String lastName, String emailAddress, Address address, ArrayList PhoneNumberArray, String classStanding) {
        super(firstName, lastName, emailAddress, address, PhoneNumberArray);
        this.classStanding = classStanding;
        numOfStudents++;

        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAddress(address);
        setPhoneNumberArray(PhoneNumberArray);
    }

    public String classStanding() {
        return classStanding;
    }

    public String toString() {
        String output;

        output = super.toString() + "\nClass Standing:     " + classStanding;

        return output;
    }

}
