package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    Button sendButton;

    @FXML
    Button closeButton;

    @FXML
    public void initialize(){
        textField.requestFocus();
    }


    public void sendMsg() {
        String clearText = textField.getText().replaceAll("\\s+","");
        if (!clearText.equals("")) {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        } else {
            textField.clear();
            textField.requestFocus();
        }
    }

    public void closeProgram() {
        Platform.exit();
    }

    // Реализована отправка сообщений по нажатию Enter, но это явно костыль, и хотелось бы увидеть,
    //как это, по хорошему, реализуется
    public void enterPressed(KeyEvent e){
        if (e.getCode().getName().equals("Enter")) sendMsg();
        }
}
