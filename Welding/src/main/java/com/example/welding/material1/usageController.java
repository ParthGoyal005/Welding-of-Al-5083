package com.example.welding.material1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
import com.example.welding.SceneUtil;
import javafx.scene.control.Label;

public class usageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label selectText1;

    @FXML
    private ComboBox<String> applicationBox;

    @FXML
    void suggestAl(ActionEvent event) {
        if(applicationBox.getSelectionModel().isSelected(0))
        {
            selectText1.setVisible(true);
        }
        else {
            SceneUtil.newScene("material1/suggestView.fxml", event);
        }
    }

    @FXML
    void initialize() {
        assert applicationBox != null : "fx:id=\"applicationBox\" was not injected: check your FXML file 'usageView.fxml'.";
        applicationBox.getItems().add("Select application");
        applicationBox.getItems().add("Ship Building");
        applicationBox.getItems().add("Aerospace and Defence");
        applicationBox.getItems().add("Cryogenic vessels");
        applicationBox.getItems().add("Transportation");
        applicationBox.getSelectionModel().select(0);
    }

}
