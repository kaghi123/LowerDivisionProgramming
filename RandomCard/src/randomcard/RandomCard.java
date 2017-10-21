package randomcard;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RandomCard extends Application{
    @Override
    public void start(Stage primaryStage){
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(200, 150 ,150 ,200));
        pane.setHgap(10);
        pane.setVgap(10);
        
        Random rand = new Random();
        
        String randNumber1 = "" + rand.nextInt(52);
        Image image1 = new Image("image/" + randNumber1 + ".png");
        pane.getChildren().add(new ImageView(image1));
        
        
        String randNumber2 = "" + rand.nextInt(52);
        Image image2 = new Image("image/" + randNumber2 + ".png");
        pane.getChildren().add(new ImageView(image2));
        
        
        String randNumber3 = "" + rand.nextInt(52);
        Image image3 = new Image("image/" + randNumber3 + ".png");
        pane.getChildren().add(new ImageView(image3));
        
        
        String randNumber4 = "" + rand.nextInt(52);
        Image image4 = new Image("image/" + randNumber4 + ".png");
        pane.getChildren().add(new ImageView(image4));
        
        
        String randNumber5 = "" + rand.nextInt(52);
        Image image5 = new Image("image/" + randNumber5 + ".png");
        pane.getChildren().add(new ImageView(image5));
        
        
        
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("RandomCard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
       launch(args);
    }
}
