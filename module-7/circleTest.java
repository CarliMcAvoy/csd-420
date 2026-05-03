package advanceJava.Module7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

/*
Program demonstrates use of Stylesheet in JavaFX application to assign styling to Circle objects
 */

public class circleTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Circle Stylesheet Test");

        HBox hbx = new HBox(5);
        hbx.setAlignment(Pos.CENTER);

        Scene scene = new Scene(hbx, 400, 250);
        //add stylesheet link to java file
        scene.getStylesheets().add("circleStyle.css");

        Circle circleOne = new Circle(30, 80, 30);
        Circle circleTwo = new Circle(100,80,30);
        Circle circleThree = new Circle(30,160,30);
        Circle circleFour = new Circle(100,160,30);

        Pane pane = new Pane(circleOne,circleTwo,circleThree,circleFour);

        //add classes and Id's to circle objects
        circleOne.getStyleClass().add("circleborder");
        circleOne.setId("red");

        circleTwo.getStyleClass().add("circleborder");

        circleThree.getStyleClass().add("circleborder");
        circleThree.setId("green");

        circleFour.getStyleClass().add("circleborder");
        circleFour.setId("green");

        hbx.getChildren().add(pane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
