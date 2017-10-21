package memorygame;

import java.util.ArrayList;
import java.util.Collections;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MemoryGame extends Application {

    int gamesize;
    String theme = "";
    BorderPane bp = new BorderPane();
    ImageView pic1 = new pictureClick();

    @Override
    public void start(Stage primaryStage) {

        BorderPane bp2 = new BorderPane();
        HBox hbox = new HBox();
        Pane dummypane = new Pane();
        dummypane.setPadding(new Insets(1));

        bp.setTop(bp2);
        bp2.setTop(hbox);
        bp2.setStyle("-fx-border-color: black");
        bp2.setPadding(new Insets(10));
        bp2.setCenter(dummypane);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        RadioButton rbt4 = new RadioButton("4x4");
        RadioButton rbt6 = new RadioButton("6x6");
        RadioButton rbt8 = new RadioButton("8x8");
        RadioButton rbt10 = new RadioButton("10x10");
        Button start = new Button("Start");
        hbox.getChildren().addAll(rbt4, rbt6, rbt8, rbt10);

        bp.setLeft(new playersPane("Player 1"));
        bp.setRight(new playersPane("Player 2"));

        RadioButton theme1 = new RadioButton("Movies");
        RadioButton theme2 = new RadioButton("Video Games");
        HBox hbox2 = new HBox();
        bp2.setBottom(hbox2);
        hbox2.setSpacing(10);
        hbox2.setAlignment(Pos.CENTER);
        hbox2.getChildren().addAll(theme1, theme2, start);

        ToggleGroup group = new ToggleGroup();
        rbt4.setToggleGroup(group);
        rbt6.setToggleGroup(group);
        rbt8.setToggleGroup(group);
        rbt10.setToggleGroup(group);

        ToggleGroup group2 = new ToggleGroup();
        theme1.setToggleGroup(group2);
        theme2.setToggleGroup(group2);

        rbt4.setOnAction((ActionEvent e) -> {
            if (rbt4.isSelected()) {
                gamesize = 4;
            }
        });

        rbt6.setOnAction((ActionEvent e) -> {
            if (rbt6.isSelected()) {
                gamesize = 6;
            }
        });

        rbt8.setOnAction((ActionEvent e) -> {
            if (rbt8.isSelected()) {
                gamesize = 8;
            }
        });

        rbt10.setOnAction((ActionEvent e) -> {
            if (rbt10.isSelected()) {
                gamesize = 10;
            }
        });

        theme1.setOnAction((ActionEvent e) -> {
            if (theme1.isSelected()) {
                theme = "Movies";
            }
        });

        theme2.setOnAction((ActionEvent e) -> {
            if (theme2.isSelected()) {
                theme = "Video Games";
            }
        });

        start.setOnAction((ActionEvent e) -> {
            displayPicture();
        });

        boolean isWinner = false;

//        while (isWinner == false) {
//            if (player1Turn() == true) {
//                //player1score++
//                //if(player1score + player2score == ((gamesize * gamesize) / 2)){
//                //displaysomething saying player 1 won
//                //}
//            }
//            if (player2Turn() == true) {
//                //player2score++
//                //if(player1score + player2score == ((gamesize * gamesize) / 2)){
//                //displaysomething saying player 2 won
//                //}
//            }
//        }

        Scene scene = new Scene(bp, 700, 700);
        primaryStage.setTitle("MemoryGame");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void displayPicture() {
        GridPane grid = new GridPane();
        bp.setCenter(grid);
        grid.setStyle("-fx-border-color: black");
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(3);
        grid.setVgap(3);

        ImageView[] gamepic = new ImageView[100];

        for (int i = 0; i < gamepic.length; i++) {
            gamepic[i] = new ImageView("images/memorygamepic.png");

            FadeTransition ft = new FadeTransition(Duration.millis(1000), gamepic[i]);
            ft.setFromValue(1.0);
            ft.setToValue(0);

            gamepic[i].setOnMouseClicked(e -> ft.play());
        }

        ArrayList<ImageView> imageArray = new ArrayList();
        ImageView image = new ImageView();

        ImageView image2 = new ImageView();

        for (int i = 0; i < ((gamesize * gamesize) / 2); i++) {
            image = new ImageView("images/" + theme + "/" + String.valueOf(i + 1) + ".jpg");
            imageArray.add(image);
            imageArray.get(i).setOnMouseClicked(e -> {
            
            });

            image2 = new ImageView("images/" + theme + "/" + String.valueOf(i + 1) + ".jpg");
            imageArray.add(image2);
            imageArray.get(i).setOnMouseClicked(e -> {
            //pic1 = imageArray.get(i);
            });
        }

        Collections.shuffle(imageArray);

        int t = 0;
        int col = 0;
        int row = 0;

        for (int i = 0; i < gamesize; i++, row++) {
            for (int j = 0; j < gamesize; j++, t++, col++) {
                if (j == 0) {
                    col = 0;
                }
                imageArray.get(t).setFitHeight(60);
                imageArray.get(t).setFitWidth(55);
                grid.add(imageArray.get(t), col, row);

                gamepic[t].setFitHeight(60);
                gamepic[t].setFitWidth(55);
                grid.add(gamepic[t], col, row);
            }
        }
    }

//    public boolean player1Turn() {
//        if () {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//    public boolean player2Turn() {
//        if () {
//            return true;
//        } else {
//            return false;
//        }
//    }

    class playersPane extends VBox {

        public playersPane(String title) {
            int score = 0;
            getChildren().add(new Label(title));
            getChildren().add(new Label(String.valueOf(score)));
            setStyle("-fx-border-color: black");
            setPadding(new Insets(1, 25, 1, 1));
        }
    }
    
    class pictureClick extends ImageView {
        private ImageView image1;
        public pictureClick() {
            
        }
        
        public pictureClick(ImageView image1) {
            this.image1 = image1;
        }
        
        public void setImage(ImageView image1){
            this.image1 = image1;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
