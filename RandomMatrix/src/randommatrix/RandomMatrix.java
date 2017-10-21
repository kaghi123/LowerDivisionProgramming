package randommatrix;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RandomMatrix extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        TextField[] text = new TextField[100];
        int t = 0;
        int col = 0;
        int row = 0;

        for (int i = 0; i < 10; i++, row++) {
            for (int j = 0; j < 10; j++, t++, col++) {
                if (j == 0) {
                    col = 0;
                }
                Random rand = new Random();
                String randNum = "" + rand.nextInt(2);
                text[t] = new TextField(randNum);
                
                text[t].setAlignment(Pos.CENTER);
                
                pane.add(text[t], col, row);
            }
        }
        
        Scene scene = new Scene(pane, 320, 320);
        
        primaryStage.setTitle("RandomMatrix");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
