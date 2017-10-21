package lab3s6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab3s6 {

    public static void main(String[] args) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        

        System.out.print("Enter a text file: ");
        File file = new File("textdoc.txt");

        try {
            Scanner scan = new Scanner(file);
            String words = "";

            while (scan.hasNext()) {

                words += scan.next() + " ";
            }

            String[] tokens = words.split(" ");
            
             

            for (int j = 0; j < tokens.length; j++) {
                String tempWord = tokens[j];

                for (int k = 0; k < tempWord.length(); k++) {
                    char token = tempWord.charAt(k);

                    switch (token) {
                        case 'a':
                            a++;
                            break;
                        case 'e':
                            e++;
                            break;
                        case 'i':
                            i++;
                            break;
                        case 'o':
                            o++;
                            break;
                        case 'u':
                            u++;
                            break;
                        default:
                            break;
                    }
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }

        System.out.println();
        System.out.println("a: "+ a);
        System.out.println("e: "+ e);
        System.out.println("i: "+ i);
        System.out.println("o: "+ o);
        System.out.println("u: "+ u);
    }

}
