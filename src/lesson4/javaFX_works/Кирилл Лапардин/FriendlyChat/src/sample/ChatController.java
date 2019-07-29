package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.Background;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ChatController {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    static String name="";


    public void sendMsg(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        textArea.appendText(name + " " +sdf.format(cal.getTime())+ ":\n"  +  textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

}
