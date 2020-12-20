package sample.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Herbivore;

public class UIHerbivoreChoice {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Herbivore> herbivoreComboBox;

    @FXML
    private Button choiceButton;

    @FXML
    void initialize() {
        choiceButton.setOnAction(event ->{
            Stage stage1 = (Stage) choiceButton.getScene().getWindow();
            stage1.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/fxml/herbivoreMove.fxml"));
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
        });
    }
}
