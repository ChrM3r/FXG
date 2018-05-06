package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.AllContacts;
import model.Contact;
import model.MailAdress;

import java.util.ArrayList;

public class ShowContacts extends Application{

    @Override
    public void start(Stage primaryStage) {
        try {

            ScrollPane root = new ScrollPane();
            VBox box = new VBox();
            box.setSpacing(20);

            ArrayList<Contact> contacts = Contact.getDefaultContacts();

            for (Contact c : contacts) {
                GridPane kontaktePane = kontaktAnzeigen(c);
                box.getChildren().add(kontaktePane);
            }

            root.setContent(box);
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private GridPane kontaktAnzeigen(Contact contact) {
        GridPane root = new GridPane();
        // horizontal gap and vertical gap between columns and lines
        root.setHgap(10);
        root.setVgap(10);
        //limit the width of columns
        //gives a limit to column 0
        root.getColumnConstraints().add(new ColumnConstraints(100));
        //gives a limit to column 1
        root.getColumnConstraints().add(new ColumnConstraints(140));
        // an Insets defines the space around a region
        // here space will be added around the grid
        root.setPadding(new Insets(25, 25, 25, 25));

        Label kontaktdaten = new Label(contact.getVname() + " " + contact.getNname() + "\n"
                + contact.getStrasse() + "\n"
                + contact.getPlz() + " " + contact.getOrt() + "\n"
                + contact.getNummer());

        root.add(kontaktdaten, 0, 0);

        Image image = new Image(getClass().
                getResource("/resources/" + contact.getFoto()).toString());

        ImageView imageview = new ImageView(image);
        root.add(imageview, 1, 0);

        Label labelemail = new Label("-- E-Mail-Adresse(n) --");
        root.add(labelemail, 0, 1);
        root.add(emailsAnzeigen(contact),0,2,2,1);


        return root;
    }

    private ScrollPane emailsAnzeigen(Contact contact){

        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(8, 8, 8, 8));
        int row = 0;
        // the rows of root are dynamically allocated
        ArrayList<MailAdress> adresses = contact.getAdresses();


        for (MailAdress m : adresses){
            root.add(new Label(m.toString()),1,row);
            row++;
        }

        ScrollPane pane = new ScrollPane();
        pane.setContent(root);
        return pane;
    }
}

