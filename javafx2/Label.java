package javafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Label extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        HBox pane = new HBox();
        Image image = new Image(new FileInputStream("E:\\кот0\\20220319_142512.jpg"));
        ImageView imageView = new ImageView(image);
//        Label l1 = new Label("Cat", image);
//        l1.setContentDisplay
//        pane.getChildren().add(l1);

        Circle circle = new Circle(50);
//        Label l2 = new Label("Circle", circle);
//        pane.getChildren().add(l2);
//        l2.setContentDisplay(ContentDisplay.LEFT);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
