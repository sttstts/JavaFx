package javafx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class CSS_with_Text extends Application {
    @Override


    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(20);

//        Text text = new Text("ABC");
//        text.setX(200);
//        text.setY(200);
//        text.setFill(Color.BROWN);
//        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
//        text.setFont(font);
//        text.setStyle("-fx-fill : #8B008B; -fx-font-weight : bold; - fx-font-size :50px; " +
//                "-fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
//                "-fx-font-style : ITALIC");



        Pane pane = new Pane();
        pane.getChildren().add(circle);
//        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
