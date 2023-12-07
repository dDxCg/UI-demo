package com.example.ui_demo;

import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class MainController implements Initializable{

    @FXML
    private AnchorPane CallButton;

    @FXML
    private AnchorPane ChatButton;

    @FXML
    private AnchorPane UsersButton;

    @FXML
    private AnchorPane Exit;

    private final SwitchScene switchScene = new SwitchScene();
    public static final String MESSAGE = "message.fxml";
    public static final String MAIN = "main.fxml";
    public static final String LIST = "contactList.fxml";
    public static final String CALL = "calls.fxml";
    public static final String CALLING = "calling.fxml";
    public static final String VIDEOCALLING = "videocalling.fxml";

    public void switchToMessage(MouseEvent event) throws IOException {
        switchScene.SwitchToScene(event, MESSAGE);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Exit.setOnMouseClicked(MouseEvent -> {
            javafx.application.Platform.exit();
        });

        UsersButton.setOnMouseClicked(event -> {
            try {
                switchScene.SwitchToScene(event, LIST);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        CallButton.setOnMouseClicked(event -> {
            try {
                switchScene.SwitchToScene(event, CALL);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}