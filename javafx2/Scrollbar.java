package javafx2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scrollbar extends Application {
    @Override
    public void start(Stage Stage) {
        BorderPane borderPane = new BorderPane();
        Scrollbar scrollBarV = new Scrollbar();
//        scrollBarV.setOrientation(Orientation.VERTICAL);
        Scrollbar scrollBarH = new Scrollbar();
        Pane pane = new Pane();
        Text text = new Text("Olympic Games");
        text.setX(20);
        text.setY(20);
        pane.getChildren().add(text);

        borderPane.setCenter(pane);
//        borderPane.setBottom(scrollBarH);
//        borderPane.setRight(scrollBarV);

//        text.xProperty().bind(scrollBarH.valueProperty().multiply(2));
//        text.yProperty().bind(scrollBarV.valueProperty().multiply(2));

        Scene scene = new Scene(borderPane, 200, 200);
//        stage.setscene(scene);
//        stage.show();
    }
}
