package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextField nameF;

    private static Stage firstStage;

    public void handleAction () throws Exception {
        firstStage.close();
        ChatController.name =nameF.getText();
        Parent root = FXMLLoader.load(getClass().getResource("Chat_UI.fxml"));
        Stage secondStage = new Stage();

        secondStage.setTitle("Friendly Chat");
        secondStage.setScene(new Scene(root, 350, 375));
        secondStage.show();

    }

    public static void  initFirstStage(Stage stage) {
        firstStage=stage;
    }
}
