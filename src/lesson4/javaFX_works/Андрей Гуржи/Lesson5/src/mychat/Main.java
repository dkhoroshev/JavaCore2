package mychat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("С НАСТУПАЮЩИМ!");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
        String file = "src/content/abba.mp3";
        Media sound = new Media(new File(file).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
