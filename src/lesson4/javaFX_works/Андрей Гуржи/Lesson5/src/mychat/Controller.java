package mychat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;


import java.io.File;


public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

        public void sound(){
            String sms = "src/content/sms.mp3";
            Media sound = new Media(new File(sms).toURI().toString());

            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

        }


    public void sendmsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n" );
        textField.clear();
        textField.requestFocus();
        sound();
    }
}
