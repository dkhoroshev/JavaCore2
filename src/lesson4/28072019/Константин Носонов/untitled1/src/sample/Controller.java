package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm:ss ");

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    private Button btn1;

    @FXML
    private void actionF(ActionEvent event) {
        textArea.appendText(formatForDateNow.format(dateNow) + ":  " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

//    public void sendMsg() {
//        textArea.appendText(textField.getText() + "\n");
//        textField.clear();
//        textField.requestFocus();
//    }
}

