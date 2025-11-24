package com.example.welding.baking3;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class bakingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    void suggestBaking(ActionEvent event) {
        SceneUtil.newScene("baking3/suggestbakingView.fxml", event);
    }

    @FXML
    void initialize() {

    }

}
