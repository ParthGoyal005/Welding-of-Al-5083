package com.example.welding.material1;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class suggestController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void joint(ActionEvent event) {

        SceneUtil.newScene("joint2/jointView.fxml",event);
    }

    @FXML
    void initialize() {

    }

}
