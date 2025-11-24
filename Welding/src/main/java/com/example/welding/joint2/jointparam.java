package com.example.welding.joint2;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class jointparam {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void baking(ActionEvent event) {
        SceneUtil.newScene("baking3/bakingView.fxml",event);
    }

    @FXML
    void initialize() {

    }

}
