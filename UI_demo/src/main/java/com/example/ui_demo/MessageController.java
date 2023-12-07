package com.example.ui_demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MessageController implements Initializable {

    @FXML
    private AnchorPane Back;

    @FXML
    private ImageView Call;

    @FXML
    private AnchorPane Exit;

    @FXML
    private ImageView VideoCall;

    private final SwitchScene switchScene = new SwitchScene();



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Exit.setOnMouseClicked(event -> {
            javafx.application.Platform.exit();
        });
        Back.setOnMouseClicked(event -> {
            try {
                switchScene.SwitchToScene(event, MainController.MAIN);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Call.setOnMouseClicked(event -> {
            try {
                switchScene.SwitchToScene(event, MainController.CALLING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        VideoCall.setOnMouseClicked(event -> {
            try {
                switchScene.SwitchToScene(event, MainController.VIDEOCALLING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
