package com.example.welding.powersource4;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class powersourceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void sheildingGas(ActionEvent event) {
        SceneUtil.newScene("shieldinggas5/shieldingView.fxml", event);
    }

    @FXML
    void suggestPower(ActionEvent event) {
        SceneUtil.newScene("powersource4/suggestpowerView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
