package lab3s5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab3s5 {

    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.print("Enter a text file: ");
        File file = new File("textdoc.txt");
        
        try{
            Scanner scan = new Scanner(file);
            String words = "";
            
           while(scan.hasNext()){
               
               words += scan.next() + " ";
           }
        
        
            String[] tokens = words.split(" ");

        treeSet.addAll(Arrays.asList(tokens));
        
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
       

        System.out.println("Sorted Set: " + treeSet);
    }

}
