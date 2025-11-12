package com.example.welding.material1;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class materialController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> materialCombo;

    @FXML
    private Label selectText;

    @FXML
    void idk(ActionEvent event) {
        SceneUtil.newScene("material1/usageView.fxml", event);
    }

    @FXML
    void next(ActionEvent event) {
        if(materialCombo.getSelectionModel().isSelected(2))
        {
            SceneUtil.newScene("joint2/jointView.fxml", event);
        }
        else if(materialCombo.getSelectionModel().isSelected(0))
        {
            selectText.setVisible(true);
        }
        else{
            SceneUtil.newScene("material1/usageView.fxml", event);
        }
    }



    @FXML
    void initialize() {
        assert materialCombo != null : "fx:id=\"materialCombo\" was not injected: check your FXML file 'materialView.fxml'.";
        materialCombo.getItems().add("Select Item");
        materialCombo.getItems().add("Steel");
        materialCombo.getItems().add("Aluminium 5xxx");
        materialCombo.getItems().add("Aluminium 6xxx");
        materialCombo.getItems().add("Aluminium 4xxx");
        materialCombo.getItems().add("Aluminium 3xxx");
        materialCombo.getSelectionModel().select(0);
    }

}
