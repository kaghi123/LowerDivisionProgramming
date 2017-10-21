package lab3s3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab3s3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Enter Words: ");
        String words = input.nextLine();

        String[] tokens = words.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            if (!list.contains(tokens[i])) {
                list.add(tokens[i]);
            }

        }

        Collections.sort(list);

        System.out.println("Sorted List: " + list);

    }
}
