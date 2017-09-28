/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.ifrscanoas.navigator;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author developer
 */
public class BigolinNavigator extends Application {

    private Scene scene;

    @Override
    public void start(Stage stage) {
        // create the scene
        stage.setTitle("Web View");
        scene = new Scene(new Browser(), 750, 500, Color.web("#666970"));
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Você jamais sairá");
        //\ stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        monitoraTudo(stage);
        stage.show();
    }

    private void monitoraTudo(Stage stage) {
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MA‌TCH);
        stage.getScene().setOnKeyPressed(new EventHandler<KeyEvent>() {

            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ALT) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("I SEE");
                    alert.setHeaderText("Você não deveria fazer isso");
                    alert.setContentText("I see....");

                    alert.showAndWait();
                }
                System.out.println("Key Pressed: " + ke.getCode());
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
