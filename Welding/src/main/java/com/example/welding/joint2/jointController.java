package com.example.welding.joint2;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class jointController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void bakingPlate(MouseEvent event){
        SceneUtil.newScene2("joint2/jointparamView.fxml",event);
    }

    @FXML
    void wrong(MouseEvent event) {
        SceneUtil.newScene2("joint2/suggestjointView.fxml",event);
    }

    @FXML
    void suggestJoint(ActionEvent event) {
        SceneUtil.newScene("joint2/suggestjointView.fxml",event);
    }

    @FXML
    void initialize() {

    }

}
