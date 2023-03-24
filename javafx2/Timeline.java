package javafx2;

import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileNotFoundException;

//public class Timeline extends Application {
//    @Override
//    public void start(Stage primartyStage) throws FileNotFoundException {
//        Pane pane = new Pane();
//        Text text = new Text("ABC");
//        text.setFill(Color.RED);
//        text.setX(200);
//        text.setY(200);
//        pane.getChildren().add(text);
//
//        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                if(b){
//                    text.setStyle("-fx-font-size : 30");
//                    text.setX(50);
//                    text.setY(50);
//                    b = !b;
//                } else {
//                    text.setStyle("-fx-font-size : 15");
//                    text.setX(200);
//                    text.setY(200);
//                    b = !b;
//                }
//            }
//        }));
//        timeline.setCucleCount(Timeline.INDEFINITE);
//        timeline.play();
//
//        Scene scene = new Scene(pane, 400, 400);
//        primartyStage.setScene(scene);
//        primartyStage.show();
//    }
//}
