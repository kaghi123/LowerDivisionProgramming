package cs203hw2;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class CS203HW2 extends Application {

    int WIDTH = 300, HEIGHT = 280;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        KochSnowFlakePane trianglePane = new KochSnowFlakePane();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(
                e -> trianglePane.setOrder(Integer.parseInt(tfOrder.getText())));
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        // Pane to hold label, text field, and a button
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(trianglePane);
        borderPane.setBottom(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
        primaryStage.setTitle("Snow Flake"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> trianglePane.paint());
        scene.heightProperty().addListener(ov -> trianglePane.paint());
    }

    /**
     * Pane for displaying fractal
     */
    static class KochSnowFlakePane extends Pane {

        private int order = 0;

        /**
         * Set a new order
         */
        public void setOrder(int order) {
            this.order = order;
            paint();
        }

        KochSnowFlakePane() {
        }

        protected void paint() {
            double side = Math.min(getWidth(), getHeight()) * 0.8;
            double triangleHeight = side * Math.sin(Math.toRadians(60));
            double base = getWidth();

            // Set initial three points
            Point2D p1 = new Point2D(base / 2, 10);
            Point2D p2 = new Point2D(base / 2 - side / 2, 10 + triangleHeight);
            Point2D p3 = new Point2D(base / 2 + side / 2, 10 + triangleHeight);

            this.getChildren().clear(); // Clear the pane before redisplay

            displayKochSnowFlake(order, p1, p2);
            displayKochSnowFlake(order, p2, p3);
            displayKochSnowFlake(order, p3, p1);
        }

        private void displayKochSnowFlake(int order, Point2D p1, Point2D p2) {

            
            
        }
    }
 
    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
