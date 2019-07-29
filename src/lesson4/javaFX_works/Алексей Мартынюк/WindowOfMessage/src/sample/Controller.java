package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.Date;

public class Controller {
    private boolean checkToSideText = false;

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    Button btn;

    Date date = new Date();

    public void sendMsg() {
        textArea.appendText( date.toString() + "\n" + textField.getText() + "\n");
        textField.clear();
        checkToSideText = true;
        textField.requestFocus();
    }

}