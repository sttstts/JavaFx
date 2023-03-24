package javafx2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BorderPane extends Application {
    @Override

    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        circle.setFill(javafx.scene.paint.Color.BLUE);
        Text text = new Text("ABC");
        text.setStyle("-fx-fill : #8B008B; -fx-font-weight : bold; - fx-font-size :50px; " +
                "-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-font-style : ITALIC");
        Rectangle rectangle = new Rectangle(100, 100, 100, 100);

        BorderPane borderPane = new BorderPane();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);
        stackPane.getChildren().add(text);

//        borderPane.setLeft(stackPane);


//        Scene scene = new Scene(borderPane, 400, 400);
//        primaryStage.setScene(scene);
        primaryStage.show();
    }
}