package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextArea textAreaID;

    @FXML
    TextField textFieldID;

//    @FXML
//    Button btnID;

    public void sendMessage(){
        textAreaID.appendText(textFieldID.getText() + "\n");
        textFieldID.clear();
        textFieldID.requestFocus();
    }
}
