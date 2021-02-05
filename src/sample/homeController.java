package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
        Parent root = FXMLLoader.load(getClass().getResource("doctorsHome.fxml"));
        Stage primaryStage = null;
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
}
