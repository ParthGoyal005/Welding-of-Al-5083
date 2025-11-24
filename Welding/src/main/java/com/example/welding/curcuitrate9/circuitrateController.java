package com.example.welding.curcuitrate9;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.welding.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class circuitrateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField rate;

    @FXML
    void next(ActionEvent event) {
        float temp= Float.parseFloat(rate.getText());

        if(temp>18 && temp<26)
        {
            SceneUtil.newScene("tubedistance10/tubedistanceView.fxml", event);
        }
        else{
            SceneUtil.newScene("curcuitrate9/suggestrateView.fxml", event);
        }
    }

    @FXML
    void initialize() {
        assert rate != null : "fx:id=\"rate\" was not injected: check your FXML file 'curcuitrateView.fxml'.";

    }

}
