package personproject;

import java.util.ArrayList;

public class PersonProjectTester {

    static ArrayList<PhoneNumber> PhoneNumberArray = new ArrayList<>();
    /*static ArrayList<PhoneNumber> PhoneNumberArray1 = new ArrayList<>();
     static ArrayList<PhoneNumber> PhoneNumberArray2 = new ArrayList<>();
     static ArrayList<PhoneNumber> PhoneNumberArray3 = new ArrayList<>();
     static ArrayList<PhoneNumber> PhoneNumberArray4 = new ArrayList<>();
     static ArrayList<PhoneNumber> PhoneNumberArray5 = new ArrayList<>();*/
    public static void main(String[] args) {

        Database database = new Database();
        database.setPersonArray(database.getPersonArray());

        TextFile tf = new TextFile();
        tf.getArrayList(database.getPersonArray(), PhoneNumberArray);

        /*Address s1a = new Address("321", "Up st.", "", "San Dimas", "Ca", "91773");
         PhoneNumber s1p1 = new PhoneNumber("Cell", "656", "654", "9874");
         PhoneNumberArray1.add(s1p1);
         PhoneNumber s1p2 = new PhoneNumber("Home", "102", "938", "4756");
         PhoneNumberArray1.add(s1p2);
         Student s1 = new Student("Geroge", "Kassar", "gkassar@yahoo.com", s1a, PhoneNumberArray1, "Freshman");
         database.getPersonArray().add(s1);

         Address s2a = new Address("123", "Down st.", "3", "Glendora", "Ca", "91740");
         PhoneNumber s2p1 = new PhoneNumber("Cell", "626", "123", "4567");
         Student s2 = new Student("Bob", "Smith", "bobSmith@hotmail.com", s2a, PhoneNumberArray2, "Junior");
         PhoneNumberArray2.add(s2p1);
         database.getPersonArray().add(s2);

         Address sf1a = new Address("32", "Left st.", "", "San Dimas", "Ca", "91773");
         PhoneNumber sf1p1 = new PhoneNumber("Cell", "123", "345", "6789");
         PhoneNumberArray3.add(sf1p1);
         Staff sf1 = new Staff("Jane", "Willson", "J_Willson123@verizon.net", sf1a, PhoneNumberArray2, "LB-109", 25700, "Computer Technician");
         database.getPersonArray().add(sf1);

         Address sf2a = new Address("234", "Right st.", "", "Covina", "Ca", "91300");
         PhoneNumber sf2p1 = new PhoneNumber("Work", "999", "954", "3210");
         PhoneNumberArray4.add(sf2p1);
         PhoneNumber sf2p2 = new PhoneNumber("Cell", "987", "654", "4403");
         PhoneNumberArray4.add(sf2p2);
         PhoneNumber sf2p3 = new PhoneNumber("Home", "987", "654", "3339");
         PhoneNumberArray4.add(sf2p3);
         Staff sf2 = new Staff("James", "Garfeild", "thisIsJames@earthlink.net", sf2a, PhoneNumberArray3, "MA-312", 30000, "Math Profesor");
         database.getPersonArray().add(sf2);

         Address f1a = new Address("456", "Back st.", "64", "Upland", "Ca", "98765");
         PhoneNumber f1p = new PhoneNumber("Cell", "273", "847", "2389");
         PhoneNumberArray5.add(f1p);
         Faculty f1 = new Faculty("Hadley", "Regan", "HCR@yahoo.com", f1a, PhoneNumberArray4, "AT-340", 45000, "MW", "8am to 10 am", "Full Time");
         database.getPersonArray().add(f1); */
        database.printDatabase();
        System.out.println("\n\nEmployees:\n");
        database.printDatabase("Employee");
        System.out.println("\n\nFacutly:\n");
        database.printDatabase("Faculty");
        System.out.println("\n\nStaff:\n");
        database.printDatabase("Staff");
        System.out.println("\n\nStudents:\n");
        database.printDatabase("Student");
        System.out.println("Number of People: " + database.getNumberOfPeople());
        System.out.println("Number of Employee: " + database.getNumberOfEmployees());
        System.out.println("Number of Faculty: " + database.getNumberOfFaculty());
        System.out.println("Number of Staff: " + database.getNumberOfStaff());
        System.out.println("Number of Students: " + database.getNumberOfStudents());
        System.out.println("Number of Freshman: " + database.getNumberOfStudentsByClassStanding("Freshman"));
        System.out.println("Number of Sophomores: " + database.getNumberOfStudentsByClassStanding("Sophomore"));
        System.out.println("Number of Juniors: " + database.getNumberOfStudentsByClassStanding("Junior"));
        System.out.println("Number of Seniors: " + database.getNumberOfStudentsByClassStanding("Senior"));
        System.out.println("Number of Graduate: " + database.getNumberOfStudentsByClassStanding("Graduate"));
        database.displayEmployeesGreaterThanSalary(30000);
        database.displayEmployeesEqualToSalary(30000);
        database.displayEmployeesLessThanSalary(30000);

    }

}
