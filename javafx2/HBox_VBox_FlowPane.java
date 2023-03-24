package javafx2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HBox_VBox_FlowPane extends Application {
    @Override

    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
//        circle.setCenterX(100);
//        circle.setCenterY(100);
        circle.setFill(javafx.scene.paint.Color.BLUE);
//        circle.setStroke(Color.RED);
//        circle.setStrokeWidth(20);

        Text text = new Text("ABC");
//        text.setX(200);
//        text.setY(200);
        text.setStyle("-fx-fill : #8B008B; -fx-font-weight : bold; - fx-font-size :50px; " +
                "-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-font-style : ITALIC");

        Rectangle rectangle = new Rectangle(100, 100, 100, 100);


        FlowPane pane = new FlowPane();
        pane.setOrientation(Orientation.VERTICAL);
        pane.getChildren().add(text);
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}