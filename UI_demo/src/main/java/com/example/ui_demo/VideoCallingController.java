package com.example.ui_demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VideoCallingController implements Initializable {

    @FXML
    private AnchorPane Back;

    @FXML
    private AnchorPane Exit;

    @FXML
    private ImageView endcall;

    private final SwitchScene switchScene = new SwitchScene();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Exit.setOnMouseClicked(event -> {
            javafx.application.Platform.exit();
        });
        Back.setOnMouseClicked(event -> {
            try {
                switchScene.SwitchToScene(event, MainController.MESSAGE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        endcall.setOnMouseClicked(event -> {
            try {
                switchScene.SwitchToScene(event, MainController.MESSAGE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
