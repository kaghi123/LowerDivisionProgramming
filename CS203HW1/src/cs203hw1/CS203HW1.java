package cs203hw1;

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

public class CS203HW1 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        HTreePane treePane = new HTreePane();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(
                e -> treePane.setOrder(Integer.parseInt(tfOrder.getText())));
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        // Pane to hold label, text field, and a button
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(treePane);
        borderPane.setBottom(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 400, 410);
        primaryStage.setTitle("HTree"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> treePane.paint());
        scene.heightProperty().addListener(ov -> treePane.paint());
    }

    /**
     * Pane for displaying fractal
     */
    static class HTreePane extends Pane {

        private int order = 0;

        /**
         * Set a new order
         */
        public void setOrder(int order) {
            this.order = order;
            paint();
        }

        HTreePane() {
        }

        protected void paint() {
            this.getChildren().clear();
            //using unit 1 as 1/3 of width
            displayHTree(order, this.getWidth() / 3, new Point2D(this.getWidth() / 2, this.getHeight() / 2));
        }

        private void displayHTree(int order, double side, Point2D p) {

            double x = p.getX();
            double y = p.getY();

            //middle
            Point2D pm1 = new Point2D(x - side / 2, y);
            Point2D pm2 = new Point2D(x + side / 2, y);

            //left line
            Point2D pl1 = new Point2D(x - side / 2, y - side / 2);
            Point2D pl2 = new Point2D(x - side / 2, y + side / 2);

            //right line
            Point2D pr1 = new Point2D(x + side / 2, y - side / 2);
            Point2D pr2 = new Point2D(x + side / 2, y + side / 2);

            if (order > 0) {
                displayHTree(order - 1, side / 2, new Point2D(x - side / 2, y - side / 2));
                displayHTree(order - 1, side / 2, new Point2D(x - side / 2, y + side / 2));
                displayHTree(order - 1, side / 2, new Point2D(x + side / 2, y - side / 2));
                displayHTree(order - 1, side / 2, new Point2D(x + side / 2, y + side / 2));
                
                
                this.getChildren().add(new Line(x - side / 2, y, x + side / 2, y));
                this.getChildren().add(new Line(x - side / 2, y - side / 2, x - side / 2, y + side / 2));
                this.getChildren().add(new Line(x + side / 2, y - side / 2, x + side / 2, y + side / 2));
                
            } 
            
            else{
                this.getChildren().add(new Line(x - side / 2, y, x + side / 2, y));
                this.getChildren().add(new Line(x - side / 2, y - side / 2, x - side / 2, y + side / 2));
                this.getChildren().add(new Line(x + side / 2, y - side / 2, x + side / 2, y + side / 2));
            }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
