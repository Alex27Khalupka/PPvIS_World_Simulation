package sample.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UIPredatorWinMessage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button endButton;

    @FXML
    void initialize() {
        endButton.setOnAction(event -> {
            Stage stage1 = (Stage) endButton.getScene().getWindow();
            stage1.close();
        });

    }
}
