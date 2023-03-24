package javafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FadeTransition extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("E:\\кот0\\20220319_142512.jpg"));
        ImageView imageView = new ImageView(image);

//        FadeTransition ft = new FadeTransition(Duration.millis(3000), imageView);
//        ft.setFromValue(1.0);
//        ft.setToValue(0.0);
//        ft.setCycleCount(5);
//        ft.setAutoReverse(true);
//        ft.play();

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
