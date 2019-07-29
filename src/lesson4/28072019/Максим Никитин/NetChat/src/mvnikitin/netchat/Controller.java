package mvnikitin.netchat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

//public class Controller {
public class Controller {
    @FXML
    TextArea textArea;

//    @FXML
//    TextField textField;

    @FXML
    TextArea messageTextArea;

    @FXML
    Button btn1;

//    public void sendMsg() {
//        String textToSend = textField.getText();
//
//        if (!textToSend.isEmpty()) {
//            textArea.appendText(textToSend + "\n");
//            textField.clear();
//            textField.requestFocus();
//        }
//    }

    public void sendMsg() {
        String textToSend = messageTextArea.getText();

        if (!textToSend.isEmpty()) {
            textArea.appendText(textToSend + "\n");
            messageTextArea.clear();
            messageTextArea.requestFocus();
        }
    }

    @FXML
    public void buttonPressed(KeyEvent e)
    {
        if(e.isShiftDown() && e.getCode().toString().equals("ENTER"))
            sendMsg();
    }
}
