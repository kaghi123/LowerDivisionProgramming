package bookstore;

public class Author {

    private String firstName;
    private String lastName;

    public Author() {

    }

    public Author(String firstName, String lastName) {
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

        output = "Author:          " + firstName + " " + lastName;

        return output;
    }
}
