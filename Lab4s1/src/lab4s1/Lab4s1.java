package lab4s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab4s1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arraylist = new ArrayList<>();
        System.out.println("Enter a list of Integers: ");
        String words = input.nextLine();

        String[] tokens = words.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            int tempNum = Integer.parseInt(tokens[i]);
            if (tempNum != 0) {
                arraylist.add(tempNum);
            }

        }

        Collections.sort(arraylist);
        int largestNumIndex = 0;
        int largestCounter = 0;

        for (int i = 0; i < arraylist.size(); i++) {
            int counter = 1;
            if(i != arraylist.size() - 1) {
                if (arraylist.get(i).equals(arraylist.get(i + 1))) {
                    counter++;
                    if (counter > largestCounter) {
                        largestCounter = counter;
                        largestNumIndex = i;
                    }

                } else {

                }
            }
       }

        System.out.println(arraylist.get(largestNumIndex));

    }

}
