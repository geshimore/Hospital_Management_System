package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DoctorsLogin {
    @FXML
    private Button loginbtn;

    public void doctorLogin(ActionEvent actionEvent) throws IOException {
        Parent doctorLoginViewParent = FXMLLoader.load(getClass().getResource("doctorsHome.fxml"));
        Scene doctorLoginViewScene = new Scene(doctorLoginViewParent);
        Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(doctorLoginViewScene);
        window.show();

    }
}
