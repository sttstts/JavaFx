package javafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class TexArea_ScrollPane_Image_ImageView extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane pane = new BorderPane();
        TextArea textArea = new TextArea();
//        ScrollPane scrollPane = new ScrollPane(textArea);
//        Image image = new Image(new FileInputStream("E:\\кот0\\20220319_142512.jpg"));
//        ImageView imageView = new ImageView(image);
//        imageView.setFitWidth(200);
//        imageView.setFitHeight(150);
//        Label l1 = new Label("Java", imageView);
//        l1.setContentDisplay(ContentDisplay.TOP);

//        pane.setleft(l1);
//        pane.setCenter(textArea);

//        Scene scene = new Scene(pane, 400, 400);
//        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
