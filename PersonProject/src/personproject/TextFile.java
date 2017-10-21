package personproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile {

    

    public static void main(String[] args) throws FileNotFoundException {
    }

    public ArrayList<Person> getArrayList(ArrayList<Person> PersonArray, ArrayList<PhoneNumber> PhoneNumberArray) {
        Scanner input = new Scanner(System.in);
        String fileName;
        String nextLine = "";
        Database database = new Database();
        database.setPersonArray(database.getPersonArray());
        try {
            System.out.println("What is the name of your file?: ");
            fileName = input.next();
            input = new Scanner(new File(fileName));
            nextLine = input.nextLine();
            
            while (input.hasNext()) {

                String[] tokens = nextLine.split(",");

                String className = tokens[0];

                if (null != className) {
                    switch (className) {
                        case "Student": {
                            String firstName = tokens[1];
                            String lastName = tokens[2];
                            String emailAddress = tokens[3];
                            String streetNumber = tokens[4];
                            String streetName = tokens[5];
                            String aptNumber = tokens[6];
                            if ("-1".equals(tokens[6])) {
                                tokens[6] = "";
                            }
                            String city = tokens[7];
                            String state = tokens[8];
                            String zipCode = tokens[9];
                            String classStanding = tokens[10];

                            nextLine = input.nextLine();
                            while (nextLine.contains("Phone")) {
                                String type = tokens[1];
                                String PhoneNumberCode = tokens[2];
                                String PhoneNumberPrefix = tokens[3];
                                String PhoneNumberSufix = tokens[4];

                                PhoneNumber pn = new PhoneNumber(type, PhoneNumberCode, PhoneNumberPrefix, PhoneNumberSufix);
                                PhoneNumberArray.add(pn);
                                if (nextLine.contains("Phone")) {
                                    if(!input.hasNext()){
                                        break;
                                    }
                                    nextLine = input.nextLine();
                                }
                            }
                            Address address = new Address(streetNumber, streetName, aptNumber, city, state, zipCode);

                            Student student = new Student(firstName, lastName, emailAddress, address, PhoneNumberArray, classStanding);
                            PersonArray.add(student);
                            break;
                        }
                        case "Staff": {
                            String firstName = tokens[1];
                            String lastName = tokens[2];
                            String emailAddress = tokens[3];
                            String streetNumber = tokens[4];
                            String streetName = tokens[5];
                            String aptNumber = tokens[6];
                            if ("-1".equals(tokens[6])) {
                                tokens[6] = "";
                            }
                            String city = tokens[7];
                            String state = tokens[8];
                            String zipCode = tokens[9];
                            String officeLocation = tokens[10];
                            double salary = Double.parseDouble(tokens[11]);
                            String jobTitle = tokens[12];

                            nextLine = input.nextLine();
                            while (nextLine.contains("Phone")) {
                                String type = tokens[1];
                                String PhoneNumberCode = tokens[2];
                                String PhoneNumberPrefix = tokens[3];
                                String PhoneNumberSufix = tokens[4];

                                PhoneNumber spn = new PhoneNumber(type, PhoneNumberCode, PhoneNumberPrefix, PhoneNumberSufix);
                                PhoneNumberArray.add(spn);
                                if (nextLine.contains("Phone")) {
                                    if(!input.hasNext()){
                                        break;
                                    }
                                    nextLine = input.nextLine();
                                }
                            }
                            Address address = new Address(streetNumber, streetName, aptNumber, city, state, zipCode);

                            Staff staff = new Staff(firstName, lastName, emailAddress, address, PhoneNumberArray, officeLocation, salary, jobTitle);
                            PersonArray.add(staff);
                            break;
                        }
                        case "Faculty": {
                            String firstName = tokens[1];
                            String lastName = tokens[2];
                            String emailAddress = tokens[3];
                            String streetNumber = tokens[4];
                            String streetName = tokens[5];
                            String aptNumber = tokens[6];
                            if ("-1".equals(tokens[6])) {
                                tokens[6] = "";
                            }
                            String city = tokens[7];
                            String state = tokens[8];
                            String zipCode = tokens[9];
                            String officeLocation = tokens[10];
                            double salary = Double.parseDouble(tokens[11]);
                            String officeHoursDays = tokens[12];
                            String officeHours = tokens[13];
                            String rank = tokens[14];

                            nextLine = input.nextLine();
                            while (nextLine.contains("Phone")) {
                                String type = tokens[1];
                                String PhoneNumberCode = tokens[2];
                                String PhoneNumberPrefix = tokens[3];
                                String PhoneNumberSufix = tokens[4];

                                PhoneNumber fpn = new PhoneNumber(type, PhoneNumberCode, PhoneNumberPrefix, PhoneNumberSufix);
                                PhoneNumberArray.add(fpn);
                                if (nextLine.contains("Phone")) {
                                    if(!input.hasNext()){
                                        break;
                                    }
                                    nextLine = input.nextLine();
                                }
                            }
                            Address address = new Address(streetNumber, streetName, aptNumber, city, state, zipCode);

                            Faculty faculty = new Faculty(firstName, lastName, emailAddress, address, PhoneNumberArray, officeLocation, salary, officeHoursDays, officeHours, rank);
                            PersonArray.add(faculty);
                            break;
                        }

                    }
                }

            }
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return PersonArray;

    }
}
