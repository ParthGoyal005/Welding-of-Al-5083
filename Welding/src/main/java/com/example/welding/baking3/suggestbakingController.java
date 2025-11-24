package com.example.welding.baking3;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestbakingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void parameters(ActionEvent event) {
        SceneUtil.newScene("powersource4/powersourceView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
