package lab3s7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Lab3s7 {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        System.out.print("Enter a text file: ");
        File file = new File("textdoc.txt");

        try {
            Scanner scan = new Scanner(file);
            String words = "";

            while (scan.hasNext()) {

                words += scan.next() + " ";
            }

            String[] tokens = words.split(" ");
            for (int i = 0; i < tokens.length; i++) {
                String key = tokens[i].toLowerCase();

                if (key.length() > 0) {
                    if (!map.containsKey(key)) {
                        map.put(key, 1);
                    } else {
                        int value = map.get(key);
                        value++;
                        map.put(key, value);
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        
        System.out.println();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "\t" + "\t" +  entry.getValue());
        }
    }
}
