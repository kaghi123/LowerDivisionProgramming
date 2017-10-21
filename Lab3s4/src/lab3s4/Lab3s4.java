package lab3s4;

import java.util.Scanner;
import java.util.TreeSet;

public class Lab3s4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("Enter Words: ");
        String words = input.nextLine();

        String[] tokens = words.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            treeSet.add(tokens[i]);
        }

        System.out.println("Sorted tree set: " + treeSet);

    }
}
