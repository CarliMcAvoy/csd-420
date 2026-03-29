package advanceJava.Module1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.image.*;

import java.util.ArrayList;

/*
Program demonstrates use of lambda expressions, mouse click event handling, using the image class,
and using the shuffle() method.
*/


public class CardShuffle extends Application{
    @Override
    public void start(Stage stage) {

        //set stage
        stage.setTitle("Module 1.2 - Shuffle Cards");
        HBox pane = new  HBox(10);
        pane.setAlignment(Pos.CENTER);


        //initialize the deck and shuffle numbers
        ArrayList<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            deck.add(i);
        }
        java.util.Collections.shuffle(deck);

        //display initial cards
        ImageView initialOne = new ImageView("../../src/main/resources/deck/" + deck.get(0) + ".png");
        ImageView initialTwo = new ImageView("../../src/main/resources/deck/" + deck.get(1) + ".png");
        ImageView initialThree = new ImageView("../../src/main/resources/deck/" + deck.get(2) + ".png");
        ImageView initialFour = new ImageView("../../src/main/resources/deck/" + deck.get(3) + ".png");
        pane.getChildren().addAll(initialOne,initialTwo,initialThree,initialFour);


        //button to shuffle and display new cards
        Button refresh = new Button("Refresh");
        refresh.setOnAction(e -> {
            pane.getChildren().clear();
            for (int i = 0; i < 4; i++) {
                String file = "../../src/main/resources/deck/" + deck.get(i) + ".png";
                try {
                    ImageView card = new ImageView(file);
                    pane.getChildren().add(card);
                } catch (Exception event) {
                    System.out.println("Error loading image: " + file);
                }
            }
        });


        //layout using borderpane
        BorderPane bp = new BorderPane();
        bp.setCenter(pane);
        bp.setBottom(refresh);
        BorderPane.setAlignment(refresh, Pos.CENTER);


        //create scene and show stage
        Scene scene = new Scene(bp, 400, 250);
        stage.setScene(scene);
        stage.show();
    }


        public static void main(String[] args) {
            launch(args);
        }
}
