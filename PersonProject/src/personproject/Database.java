package personproject;

import java.util.ArrayList;

public class Database {

    private ArrayList<Person> PersonArray = new ArrayList<>();

    public Database() {

    }

    public Database(ArrayList PersonArray) {
        this.PersonArray = PersonArray;
    }

    public void setPersonArray(ArrayList PersonArray) {
        this.PersonArray = PersonArray;

    }

    public ArrayList<Person> getPersonArray() {
        return PersonArray;
    }

    public void printDatabase() {

        for (int i = 0; i < PersonArray.size(); i++) {
            String output;

            output = PersonArray.get(i).toString();

            System.out.println(output + "\n\n");
        }
    }

    public void printDatabase(String personType) {
        String output = "";
        for (int i = 0; i < PersonArray.size(); i++) {

            if ("Employee".equals(personType)) {
                if (PersonArray.get(i).getClass().getCanonicalName().contains("Staff") || PersonArray.get(i).getClass().getCanonicalName().contains("Faculty")) {
                    output = PersonArray.get(i).toString();
                    System.out.println(output + "\n");
                }
            }

            if (PersonArray.get(i).getClass().getCanonicalName().contains(personType)) {
                output = PersonArray.get(i).toString();
                System.out.println(output + "\n");
            }

        }

    }

    public int getNumberOfPeople() {
        return Person.numOfPeople;
    }

    public int getNumberOfStudents() {
        return Student.numOfStudents;
    }

    public int getNumberOfEmployees() {
        return Employee.numOfEmployee;
    }

    public int getNumberOfStaff() {
        return Staff.numOfStaff;
    }

    public int getNumberOfFaculty() {
        return Faculty.numOfFaculty;
    }

    public int getNumberOfStudentsByClassStanding(String classStanding) {
        int numOfStudents1 = 0;
        for (int i = 0; i < PersonArray.size(); i++) {
            if ((PersonArray.get(i)) instanceof Student) {
                if ((((Student) PersonArray.get(i)).classStanding()).contains(classStanding)) {
                    numOfStudents1++;
                }

            }

        }
        return numOfStudents1;
    }

    public void displayEmployeesGreaterThanSalary(double salary) {
        System.out.println("\nEmployees with salaries greater than $30,000: \n");
        for (int i = 0; i < PersonArray.size(); i++) {
            if ((PersonArray.get(i)) instanceof Employee) {
                if ((((Employee) PersonArray.get(i)).salary()) > salary) {
                    System.out.println(PersonArray.get(i).toString() + "\n");
                }
            }

        }

    }

    public void displayEmployeesEqualToSalary(double salary) {
        System.out.println("\nEmployees with salaries equal to $30,000: \n");
        for (int i = 0; i < PersonArray.size(); i++) {
            if ((PersonArray.get(i)) instanceof Employee) {
                if ((((Employee) PersonArray.get(i)).salary()) == salary) {
                    System.out.println(PersonArray.get(i).toString());
                }
            }

        }
    }

    public void displayEmployeesLessThanSalary(double salary) {
        System.out.println("\nEmployees with salaries less than $30,000: \n");
        for (int i = 0; i < PersonArray.size(); i++) {
            if ((PersonArray.get(i)) instanceof Employee) {
                if ((((Employee) PersonArray.get(i)).salary()) < salary) {
                    System.out.println(PersonArray.get(i).toString());
                }
            }

        }
    }
}
