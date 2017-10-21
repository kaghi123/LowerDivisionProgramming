package checkerboard;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class CheckerBoard extends Application{
 @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-border-color: black");
        
        
        
        Rectangle[] rectangle = new Rectangle[64];
        int r = 0;
        int col = 0;
        int row = 0;
        
        for(int i = 0; i < 8; i++, row++){
            for(int j = 0; j < 8; j++, r++, col++){
                if(j == 0){
                    col = 0;
                }
                
                rectangle[r] = new Rectangle(40, 40 ,40 ,40);
                
                if(i%2 == 0){
                    if(j%2 == 0){
                        rectangle[r].setFill(Color.WHITE);
                    }
                    else{
                        rectangle[r].setFill(Color.color(Math.random(), Math.random(), Math.random()));
                    }
                }
                else{
                    if(j%2 != 0){
                        rectangle[r].setFill(Color.WHITE);
                    }
                    else{
                        rectangle[r].setFill(Color.color(Math.random(), Math.random(), Math.random()));
                    }
                } 
                pane.add(rectangle[r], col ,row);
            }
        }  
        
        Scene scene = new Scene(pane, 320, 320);
        
        primaryStage.setTitle("CheckeredBoard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }  
}
