package bookstore;

public class Artist {

    private String firstName;
    private String lastName;

    public Artist() {

    }

    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String toString() {
        String output;

        output = "Artist:          " + firstName + " " + lastName;

        return output;
    }

}
