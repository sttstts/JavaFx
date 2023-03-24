package javafx2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Button extends Application {
    @Override

    public void start(Stage primaryStage) throws Exception{
        Circle circle = new Circle(50);
        circle.setFill(Color.BLUE);
        StackPane stackPane = new StackPane();
//        stackPane.getChildren().add(circle);
//        Button button = new Button("Change");
        StackPane stackPane2 = new StackPane();
//        stackPane2.getChildren().add(button);
//        button.setOnAction();
        BorderPane pane = new BorderPane();
//        pane.setCenter(stackPane);
//        pane.setBottom(stackPane2);

//        Scene scene = new Scene(pane, 400, 400);
//        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class ButtonListener implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent) {
//            if(circle.getRadius() == 0) circle.setRadius(100);
//            else circle.setRadius(circle.getRadius() - 10);
        }
    }
}
