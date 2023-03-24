package javafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;

public class TextField extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        TextField textField = new TextField();
        Text text = new Text();
//        textField.setLayoutX(20);
//        textField.setLayoutY(20);
        text.setX(20);
        text.setY(60);
//        pane.getChildren().addAll(textField, text);

//        textField.setOnKeyTyped(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                text.setText(textField.getText());
            }
//        });

//        Scene scene = new Scene(pane, 400, 400);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
//}
