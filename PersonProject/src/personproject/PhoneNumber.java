package personproject;

import java.util.ArrayList;

public class PhoneNumber {

    private String type;
    private String phoneNumberCode;
    private String phoneNumberPrefix;
    private String phoneNumberSufix;

    public static int numOfPhoneNumber;
    private ArrayList<PhoneNumber> PhoneNumberArray = new ArrayList<>();

    public PhoneNumber() {

    }

    public PhoneNumber(String type, String phoneNumberCode, String phoneNumberPrefix, String phoneNumberSufix) {
        this.type = type;
        this.phoneNumberCode = phoneNumberCode;
        this.phoneNumberPrefix = phoneNumberPrefix;
        this.phoneNumberSufix = phoneNumberSufix;
        numOfPhoneNumber++;
    }

    public String toString() {
        String output;

        output = "" + type + ":  (" + phoneNumberCode + ") " + phoneNumberPrefix + "-" + phoneNumberSufix + "\n                    ";

        return output;
    }
}
