package personproject;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private Address address;
    public static int numOfPeople;

    private ArrayList<PhoneNumber> PhoneNumberArray = new ArrayList<>();

    public Person() {

    }

    public Person(String firstName, String lastName, String emailAddress, Address address, ArrayList<PhoneNumber> PhoneNumberArray) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.PhoneNumberArray = PhoneNumberArray;

        numOfPeople++;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String emailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<PhoneNumber> getPhoneNumberArray() {
        return PhoneNumberArray;
    }

    public void setPhoneNumberArray(ArrayList PhoneNumberArray) {
        this.PhoneNumberArray = PhoneNumberArray;
    }

    public String toString() {
        String output;
        String PhoneNumberOutput = "";
        for (int j = 0; j < getPhoneNumberArray().size(); j++) {
            PhoneNumberOutput = PhoneNumberOutput + getPhoneNumberArray().get(j).toString();
        }

        output = "Name:               " + firstName + " " + lastName + "\nEmail:              " + emailAddress + address.toString() + "\nPhoneNumber:        " + PhoneNumberOutput;

        return output;

    }

}
