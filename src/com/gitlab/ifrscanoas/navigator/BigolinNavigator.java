/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.ifrscanoas.navigator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author developer
 */
public class BigolinNavigator extends Application {
    private Scene scene;
    @Override public void start(Stage stage) {
        // create the scene
        stage.setTitle("Web View");
        scene = new Scene(new Browser(),750,500, Color.web("#666970"));
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Você jamais sairá");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        scene.getStylesheets().add("css/hack.css");        
        stage.show();
    }
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
