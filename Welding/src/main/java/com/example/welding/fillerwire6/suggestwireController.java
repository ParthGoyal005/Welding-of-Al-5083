package com.example.welding.fillerwire6;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestwireController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void diameter(ActionEvent event) {
        SceneUtil.newScene("diameter7/diameterView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
