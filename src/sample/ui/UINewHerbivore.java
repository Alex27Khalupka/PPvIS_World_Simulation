package sample.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UINewHerbivore {

    private int maxHerbivoreAmount = 3;
    private int currentHerbivoreAmount = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton zebraRadioButton;

    @FXML
    private RadioButton elephantRadioButton;

    @FXML
    private RadioButton giraffeRadioButton;

    @FXML
    private TextField xCoordinateTextField;

    @FXML
    private TextField yCoordinateTextField;

    @FXML
    private Button addHerbivoreButton;

    @FXML
    void initialize() {
        addHerbivoreButton.setOnAction(event -> {
            currentHerbivoreAmount++;
            if (currentHerbivoreAmount < maxHerbivoreAmount) {
                initialize();
            } else {
                Stage stage1 = (Stage) addHerbivoreButton.getScene().getWindow();
                stage1.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/fxml/predatorChoice.fxml"));
                Parent root1 = null;
                try {
                    root1 = (Parent) fxmlLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(new Scene(root1));
                stage.show();
            }
        });
    }
}
