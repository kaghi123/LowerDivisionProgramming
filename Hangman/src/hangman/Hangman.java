package hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {

    static String currentWord = "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarations
        int incorrectLetters = 0;
        int wordLength = 0;
        String nextLetter;
        //this is making the currentWord restart find out how to fix it
        String[] currentWordArray = new String[30];

        System.out.println("Welcome to Hangman!\n");

        while (incorrectLetters < 8) {

            makePicture(incorrectLetters, currentWord);

            System.out.println("Category: Movies\n");

            randomWord(currentWord, currentWordArray, wordLength, incorrectLetters);

            System.out.println("\n\nPlease guess a letter: ");
            nextLetter = input.next();

            isCorrectandDisplay(nextLetter, currentWord, incorrectLetters, currentWordArray);

        }
    }

    public static String randomWord(String currentWord, String[] currentWordArray, int wordLength, int incorrectLetters) {
        currentWord = "";

        String[] movieList = {"titanic", "psycho", "gladiator", "rocky", "jaws", "braveheart", "goodfellas", "fargo", "inception", "interstellar", "seven", "whiplash", "memento", "alien", "birdman", "scarface", "up", "boyhood", "heat", "the godfather", "the dark knight", "pulp fiction", "star wars", "fight club", "forrest gump", "the matrix", "the shawshank redemption", "the departed", "the terminator", "the shining", "american beauty", "toy story", "taxi driver", "reservoir dogs", "patton", "raging bull", "die hard", "gone girl", "finding nemo", "mad max", "kill bill", "the avengers", "donnie darko", "harry potter", "shutter island", "citizen kane", "jurassic park", "casino", "gran torino", "king kong"};

        if (incorrectLetters == 0) {
            int randNum = new Random().nextInt(movieList.length);
            currentWord = (movieList[randNum]);
            wordLength = currentWord.length();

            for (int i = 0; i < currentWordArray.length; i++) {
                currentWordArray[i] = " ";
            }

            for (int i = 0; i < wordLength; i++) {

                String possibleLetter = Character.toString(currentWord.charAt(i));

                if (" ".equals(possibleLetter)) {

                    currentWordArray[i] = " ";
                } else {
                    currentWordArray[i] = "_";
                }

            }
        }

        for (int i = 0; i < currentWordArray.length; i++) {
            System.out.print(currentWordArray[i] + " ");

        }
        return currentWord;
    }

    public static void makePicture(int incorrectLetters, String currentWord) {
        int row;
        int column;

        String[][] picture0 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        String[][] picture1 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        String[][] picture2 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", "O", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        String[][] picture3 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", "O", " ", " ", " ", "|", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        String[][] picture4 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", "O", " ", " ", " ", "|", " ", " "},
        {" ", "/", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        String[][] picture5 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", "O", " ", " ", " ", "|", " ", " "},
        {" ", "/", "|", "\\", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        String[][] picture6 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", "O", " ", " ", " ", "|", " ", " "},
        {" ", "/", "|", "\\", " ", " ", "|", " ", " "},
        {" ", "/", " ", " ", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        String[][] picture7 = {{" ", " ", "+", "-", "-", "-", "+", " ", " "},
        {" ", " ", "|", " ", " ", " ", "|", " ", " "},
        {" ", " ", "O", " ", " ", " ", "|", " ", " "},
        {" ", "/", "|", "\\", " ", " ", "|", " ", " "},
        {" ", "/", " ", "\\", " ", " ", "|", " ", " "},
        {" ", " ", " ", " ", " ", " ", "|", " ", " "},
        {"=", "=", "=", "=", "=", "=", "=", "=", "="},};

        if (incorrectLetters < 1) {

            for (row = 0; row < picture0.length; row++) {
                for (column = 0; column < picture0[row].length; column++) {
                    System.out.print(picture0[row][column]);

                }
                System.out.println();
            }
        } else if (incorrectLetters < 2) {

            for (row = 0; row < picture1.length; row++) {
                for (column = 0; column < picture0[row].length; column++) {
                    System.out.print(picture1[row][column]);

                }
                System.out.println();
            }
        } else if (incorrectLetters < 3) {

            for (row = 0; row < picture2.length; row++) {
                for (column = 0; column < picture2[row].length; column++) {
                    System.out.print(picture2[row][column]);

                }
                System.out.println();
            }
        } else if (incorrectLetters < 4) {

            for (row = 0; row < picture3.length; row++) {
                for (column = 0; column < picture3[row].length; column++) {
                    System.out.print(picture3[row][column]);

                }
                System.out.println();
            }
        } else if (incorrectLetters < 5) {

            for (row = 0; row < picture4.length; row++) {
                for (column = 0; column < picture4[row].length; column++) {
                    System.out.print(picture4[row][column]);

                }
                System.out.println();
            }
        } else if (incorrectLetters < 6) {

            for (row = 0; row < picture5.length; row++) {
                for (column = 0; column < picture5[row].length; column++) {
                    System.out.print(picture5[row][column]);

                }
                System.out.println();
            }
        } else if (incorrectLetters < 7) {

            for (row = 0; row < picture6.length; row++) {
                for (column = 0; column < picture6[row].length; column++) {
                    System.out.print(picture6[row][column]);

                }
                System.out.println();
            }
        } else {

            for (row = 0; row < picture7.length; row++) {
                for (column = 0; column < picture7[row].length; column++) {
                    System.out.print(picture7[row][column]);

                }
                System.out.println();
            }

            System.out.println("I'm sorry! The correct word was " + currentWord + ". You have lost the game!");
        }

    }

    public static void isCorrectandDisplay(String nextLetter, String currentWord, int incorrectLetters, String[] currentWordArray) {

        int noMatches = 0;
        int j = 0;
        int correctLetter = 0;

        for (int i = 0; i < currentWord.length(); i++) {
            if (nextLetter.charAt(j) == currentWord.charAt(i)) {
                currentWordArray[i] = nextLetter;
            } else {
                noMatches++;
            }
        }

        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWordArray[i].equals("_")) {
                correctLetter++;
            }
        }

        if (correctLetter == currentWord.length()) {
            System.out.println("You Win!");
            incorrectLetters = 0;
        }

        if (noMatches == currentWord.length()) {
            incorrectLetters++;
            System.out.println("\nIncorrect guess!");
        } else {
            System.out.println("\nCorrect guess!");
        }

        if (incorrectLetters == 8) {
            System.out.println("Sorry, you lose!");
            incorrectLetters = 0;
        }

    }

}
