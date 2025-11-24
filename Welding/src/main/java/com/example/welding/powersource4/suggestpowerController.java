package com.example.welding.powersource4;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestpowerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void shieldGas(ActionEvent event) {
        SceneUtil.newScene("shieldinggas5/shieldingView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
