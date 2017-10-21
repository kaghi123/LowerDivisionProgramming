package smileyface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class SmileyFace extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Circle head = new Circle();
        BorderPane bp = new BorderPane();
        pane.getChildren().add(bp);
        
        
        head.centerXProperty().bind(pane.widthProperty().divide(2));
        head.centerYProperty().bind(pane.heightProperty().divide(2));
        head.radiusProperty().bind(pane.widthProperty().divide(3));

        head.setStroke(Color.BLACK);
        head.setFill(Color.WHITE);
        pane.getChildren().add(head);
        
        HBox hbox = new HBox(15);
        
        Ellipse leftEye = new Ellipse();
        leftEye.setRadiusX(25);
        leftEye.setRadiusY(15);
        leftEye.setStroke(Color.BLACK);
        leftEye.setFill(Color.WHITE);
        hbox.getChildren().add(leftEye);
        
        Ellipse rightEye = new Ellipse();
        rightEye.setRadiusX(25);
        rightEye.setRadiusY(15);
        rightEye.setStroke(Color.BLACK);
        rightEye.setFill(Color.WHITE);
        hbox.getChildren().add(rightEye);
        
        pane.getChildren().add(hbox);
        
        
        VBox vbox = new VBox(15);
        
      
        
        

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("SmileyFace");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
