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

public class homeController {
    @FXML
    private Button btnDoctor;

    @FXML
    private Button btnReceptionist;

    @FXML
    private Button btnPharmacy;

    @FXML
    private Button btnAdmin;

    @FXML
    void doctorsHome(ActionEvent event) throws IOException {
       /* FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("doctorsHome.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();*/
        Parent doctorViewParent = FXMLLoader.load(getClass().getResource("doctorsLogin.fxml"));
        Scene doctorViewScene = new Scene(doctorViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(doctorViewScene);
        window.show();


    }
}
