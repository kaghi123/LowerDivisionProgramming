package finalproject;

import java.util.ArrayList;

public class ContactList extends ArrayList<Contact> {

    public ContactList() {
        super();
    }

    public void addContact(Contact c) {
        super.add(c);
    }

    public Contact findContactWithLastName(String lastName) {
        //Fill in this for the extra credit
        return null;
    }

    public Contact findContactWithFirstName(String firstName) {
        //Fill in this for the extra credit
        return null;
    }

    public Contact findContactWithFirstAndLastName(String lastName, String firstName) {
        //Fill in this for the extra credit
        return null;
    }

    @Override
    public String toString() {
        String result = "";

        for (Contact c : this) {
            result += c + "\n";
        }

        return result;
    }
}
