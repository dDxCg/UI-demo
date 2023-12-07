package com.example.ui_demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CallsController implements Initializable {
    @FXML
    private AnchorPane Back;

    @FXML
    private AnchorPane Exit;

    private final SwitchScene switchScene = new SwitchScene();

    public void switchToCalling(MouseEvent event) throws IOException {
        switchScene.SwitchToScene(event, MainController.CALLING);
    }

    public void switchToVideoCalling(MouseEvent event) throws IOException {
        switchScene.SwitchToScene(event, MainController.VIDEOCALLING);
    }

    public void switchToMessage(MouseEvent event) throws IOException {
        switchScene.SwitchToScene(event, MainController.MESSAGE);
    }

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
    }
}
