package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea taHistory;
    @FXML
    TextField tfMessage;
    @FXML
    Button btnSend;

    public void sendMessage() {
        taHistory.appendText(tfMessage.getText() + "\n");
        tfMessage.clear();
        tfMessage.requestFocus();
    }
}
