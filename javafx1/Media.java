package javafx1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Media extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Media media = new Media("C:\\Users\\Степан\\Desktop\\&.mp3");
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.play();
//        MediaView mediaView = new MediaView(mediaPlayer);

        Group group = new Group();
        primaryStage.setScene(new Scene(group, 400, 300));
        primaryStage.show();
    }
}
