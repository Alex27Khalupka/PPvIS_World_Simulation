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

public class UINewPredator {

    public int maxPredatorAmount = 3;
    public int currentPredatorAmount = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addPredatorButton;

    @FXML
    private RadioButton tigerRadioButton;

    @FXML
    private RadioButton lionRadioButton;

    @FXML
    private RadioButton cheetahRadioButton;

    @FXML
    private TextField xCoordinateTextField;

    @FXML
    private TextField yCoordinateTextField;

    @FXML
    void initialize() {
           addPredatorButton.setOnAction(event ->{
            currentPredatorAmount ++;
            if (currentPredatorAmount < maxPredatorAmount) {
                initialize();
            }
            else {
                Stage stage1 = (Stage) addPredatorButton.getScene().getWindow();
                stage1.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/fxml/newHerbivore.fxml"));
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