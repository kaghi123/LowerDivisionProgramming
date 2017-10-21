package finalproject;

/**
 *
 * @author George Kassar
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField; 
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FinalProject extends Application {

    ContactList cl = new ContactList();
    Button enter = new Button("Enter");
    Button showList = new Button("Show Contact List");
    TextField firstName = new TextField();
    TextField lastName = new TextField();
    TextField phoneNumber = new TextField();
    TextField email = new TextField();

    @Override
    public void start(Stage primaryStage) {
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(5);
        gp.setVgap(5);

        Label fn = new Label("First Name:");
        Label ln = new Label("Last Name:");
        Label pn = new Label("Phone Number:");
        Label em = new Label("Email:");

        gp.add(fn, 0, 0);
        gp.add(firstName, 1, 0);
        gp.add(ln, 0, 1);
        gp.add(lastName, 1, 1);
        gp.add(pn, 0, 2);
        gp.add(phoneNumber, 1, 2);
        gp.add(em, 0, 3);
        gp.add(email, 1, 3);
        gp.add(enter, 0, 4);
        gp.add(showList, 1, 4);

        enter.setOnAction((ActionEvent e) -> {
            enter();
        });

        showList.setOnAction((ActionEvent e) -> {
            showList();
        });

        Scene scene = new Scene(gp, 400, 400);
        primaryStage.setTitle("ContactList");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void enter() {
        long phoneNum = Long.valueOf(phoneNumber.getText());
        Contact contact = new Contact();
        contact.setFirstName(firstName.getText());
        contact.setLastName(lastName.getText());
        contact.setPhoneNumber(phoneNum);
        contact.setEmail(email.getText());
        cl.add(contact);
        firstName.clear();
        lastName.clear();
        phoneNumber.clear();
        email.clear();
        
        enter.setOnAction((ActionEvent e) -> {
            enter();
        });

    }

    public void showList() {
        TextArea ta = new TextArea();
        
        for (int i = 0; i < cl.size(); i++) {
            ta.setText(cl.get(i).toString() + "\n" + ta.getText());
        }
        
        
        Stage stage = new Stage(); 
    stage.setTitle("Contact List");
    stage.setScene(new Scene(ta, 300, 300));        
    stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
