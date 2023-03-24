package javafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Color extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Pane pane = new Pane();
        Text text = new Text("ABCDEFGH");
//        Color color = new Color(1.0, 0.5, 1, 1.0);
//        text.setFill(color);
        text.setX(200);
        text.setY(200);
        pane.getChildren().add(text);

        Scene  scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
