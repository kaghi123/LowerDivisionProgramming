package lab3s2;

import java.util.Scanner;

public class Lab3s2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.util.Queue<String> queue = new java.util.LinkedList<>();

        System.out.println("Enter Words: ");
        String words = input.nextLine();

        String[] tokens = words.split(" ");
        
        for(int i = 0; i < tokens.length; i++){
            queue.offer(tokens[i]);
        }

        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }
    }

}
