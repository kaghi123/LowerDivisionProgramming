package cs203hw3;

import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class CS203HW3 extends Application {

    BorderPane bp = new BorderPane();
    Pane pane = new Pane();
    TextField tf = new TextField();
    TextField tf2 = new TextField();
    Label display = new Label();
    Label display2 = new Label();
    Label display3 = new Label();
    HBox hbox = new HBox();
    Label lb1 = new Label("Enter a letter: ");
    Label lb3 = new Label("Press ENTER to start game: ");
    Label incorrectLetters = new Label();
    String[] words = {"car", "bank", "hello", "laptop", "glasses", "lightbulb" , "mother", "father", "chair", "cup", "america"};
    ArrayList<String> currentwl = new ArrayList<>();
    ArrayList<Character> incorrectLettersArray = new ArrayList<>();
    int incorrectLettersNum = 0;
    static String currentWord = "";
    char nextLetter;
    boolean sameLetter = false;

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        VBox vbox2 = new VBox();
        Label lb2 = new Label("Incorrect Letters: ");

        bp.setCenter(pane);
        tf.setPrefColumnCount(1);
        tf2.setPrefColumnCount(1);
        bp.setBottom(vbox);
        bp.setRight(vbox2);
        vbox2.getChildren().addAll(lb2, incorrectLetters);
        vbox.getChildren().addAll(display3, display2, display, hbox);
        hbox.getChildren().addAll(lb3, tf2);
        vbox.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);
        display.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 30));
        vbox.setSpacing(10);

        tf2.setOnKeyPressed((KeyEvent ke) -> {
            if (ke.getCode().equals(KeyCode.ENTER)) {
                startGame();

            }
        });

        Scene scene = new Scene(bp, 500, 500);
        primaryStage.setTitle("Hangman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void startGame() {
        hbox.getChildren().clear();
        hbox.getChildren().addAll(lb1, tf);

        incorrectLettersNum = 0;
        incorrectLettersArray.clear();
        pane.getChildren().clear();

        getRandomWord(this.currentWord, currentwl);

        tf.setOnAction(this::enterLetter);
    }

    public void enterLetter(ActionEvent e) {

        while (incorrectLettersNum < 7) {

            display2.setText("");

            if (Character.isLetter(tf.getText().charAt(0))) {
                nextLetter = tf.getText().charAt(0);
            } else {
                display2.setText("Please enter a letter!");
            }

            for (int i = 0; i < incorrectLettersArray.size(); i++) {
                if (tf.getText().charAt(0) == (incorrectLettersArray.get(i))) {
                    sameLetter = true;
                    display2.setText("Please enter a different letter!");
                    break;
                } else {
                    sameLetter = false;
                }
            }

            if (sameLetter) {
                tf.clear();
                break;
            }

            isCorrectandDisplay(nextLetter, this.currentWord, currentwl);

            makePicture();

            tf.clear();

            break;
        }

    }

    public String getRandomWord(String currentWord, ArrayList currentwl) {
        String beginWord = "";
        if (incorrectLettersNum == 0) {
            int randNum = new Random().nextInt(words.length);
            this.currentWord = (words[randNum]);

            currentwl.clear();

            for (int i = 0; i < this.currentWord.length(); i++) {

                currentwl.add("_ ");

            }
        }
        for (int i = 0; i < this.currentwl.size(); i++) {

            beginWord = beginWord + this.currentwl.get(i);

        }
        display.setText(beginWord);

        return this.currentWord;
    }

    public void isCorrectandDisplay(char nextLetter, String currentWord, ArrayList currentwl) {
        int correct = 0;
        int noMatches = 0;
        String incorrectLetter = "";
        String temp = "";

        for (int i = 0; i < currentWord.length(); i++) {
            if (nextLetter == currentWord.charAt(i)) {
                currentwl.set(i, nextLetter);
            } else {
                noMatches++;
            }
        }

        for (int i = 0; i < currentwl.size(); i++) {

            temp = temp + currentwl.get(i);

        }
        display.setText(temp);

        for (int i = 0; i < currentWord.length(); i++) {
            if (currentwl.get(i) != ("_ ")) {
                correct++;
            }
        }

        if (correct == currentWord.length()) {
            display3.setText("You Win! Press ENTER to try again.");
            incorrectLettersNum = 0;
            hbox.getChildren().clear();
            hbox.getChildren().addAll(lb3, tf2);
            tf2.setOnKeyPressed((KeyEvent ke) -> {
                if (ke.getCode().equals(KeyCode.ENTER)) {
                    display2.setText("");
                    display3.setText("");
                    startGame();

                }
            });
        }

        if (noMatches == currentWord.length()) {
            incorrectLettersNum++;
            incorrectLettersArray.add(nextLetter);

            for (int i = 0; i < incorrectLettersArray.size(); i++) {

                incorrectLetter = incorrectLetter + " " + incorrectLettersArray.get(i);

            }
            incorrectLetters.setText(incorrectLetter);

            display2.setText("Incorrect guess!");
        } else {
            display2.setText("Correct guess!");
        }

        if (incorrectLettersNum == 7) {
            display3.setText("Sorry, you lose! Press ENTER to try again.");
            hbox.getChildren().clear();
            hbox.getChildren().addAll(lb3, tf2);
            tf2.setOnKeyPressed((KeyEvent ke) -> {
                if (ke.getCode().equals(KeyCode.ENTER)) {
                    display2.setText("");
                    display3.setText("");
                    startGame();

                }
            });

        }
    }

    public void makePicture() {
        switch (incorrectLettersNum) {
            case 1:
                Line line1 = new Line(248, 10, 248, 50);
                line1.setStrokeWidth(4);
                line1.setStroke(Color.BLACK);

                pane.getChildren().add(line1);

                break;
            case 2:
                Circle circle1 = new Circle(248, 91, 40);
                circle1.setStroke(Color.BLACK);
                circle1.setFill(null);

                pane.getChildren().add(circle1);

                break;
            case 3:
                Line line2 = new Line(248, 133, 248, 260);
                line2.setStrokeWidth(4);
                line2.setStroke(Color.BLACK);

                pane.getChildren().add(line2);

                break;
            case 4:
                Line line3 = new Line(248, 160, 180, 180);
                line3.setStrokeWidth(4);
                line3.setStroke(Color.BLACK);

                pane.getChildren().add(line3);

                break;
            case 5:
                Line line4 = new Line(251, 161, 318, 180);
                line4.setStrokeWidth(4);
                line4.setStroke(Color.BLACK);

                pane.getChildren().add(line4);

                break;
            case 6:
                Line line5 = new Line(248, 260, 200, 300);
                line5.setStrokeWidth(4);
                line5.setStroke(Color.BLACK);

                pane.getChildren().add(line5);

                break;
            case 7:
                Line line6 = new Line(251, 260, 292, 300);
                line6.setStrokeWidth(4);
                line6.setStroke(Color.BLACK);

                pane.getChildren().add(line6);
                incorrectLettersNum = 0;

                break;
        }
    }

}
