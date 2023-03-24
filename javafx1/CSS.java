package javafx1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class CSS extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Application.setUserAgentStylesheet(getClass().getResource("mycss.css").toExternalForm());

        Button button = new Button("text");
        //button.setId("my-button");
        //button.setStyle("-fx-font-size: 20");
        button.getStyleClass().add("mystyle");

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(getClass().getResource("javafx1/mycss.css").toExternalForm());
        root.getChildren().add(button);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
