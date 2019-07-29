package sample;


import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    ListView listView;

    @FXML
    VBox vBox;


    int numberMessages = 1;

    public void sendTextToArea(){ //
        Label myLabel = new Label(textField.getText());
        myLabel.setFont(Font.font("Arial", 16));

        VBox myVBox = new VBox(myLabel);

        if(listView.getItems().size() % 2 !=0){
            myVBox.setAlignment(Pos.CENTER_RIGHT);
        }


        listView.getItems().add(myVBox);
        textField.clear();
        textField.requestFocus();

        numberMessages++;
        System.out.println(numberMessages);


    }


}

