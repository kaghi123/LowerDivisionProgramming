package finalproject;

public class Contact {

    private String lastName;
    private String firstName;
    private long phoneNumber;
    private String email;

    public Contact(String lastName, String firstName, long phoneNumber, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contact() {
        super();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String out = "";

        out += "Name:\t" + this.lastName + ", " + this.firstName + "\n";
        out += "Phone:\t" + this.phoneNumber + "\n";
        out += "Email:\t" + this.email + "\n";

        return out;
    }
}
