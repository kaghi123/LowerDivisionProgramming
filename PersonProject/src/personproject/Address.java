package personproject;

public class Address {

    private String streetNumber;
    private String streetName;
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;

    public Address() {

    }

    public Address(String streetNumber, String streetName, String aptNumber, String city, String state, String zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String streetNumber() {
        return streetNumber;
    }

    public String streetName() {
        return streetName;
    }

    public String aptNumber() {
        return aptNumber;
    }

    public String city() {
        return city;
    }

    public String state() {
        return state;
    }

    public String zipCode() {
        return zipCode;
    }

    public String toString() {
        String output;
        if (!"".equals(aptNumber)) {
            output = "\nAddress:            " + streetNumber + " " + streetName + " " + "Apt# " + aptNumber + "\n                    " + city + ", " + state + ", " + zipCode;
        } else {
            output = "\nAddress:            " + streetNumber + " " + streetName + " " + "\n                    " + city + ", " + state + ", " + zipCode;
        }

        return output;
    }
}
