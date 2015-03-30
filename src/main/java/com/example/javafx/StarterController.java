package com.example.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Controller for starter-application.fxml file.
 */
public class StarterController implements Initializable {

  @FXML
  private Button helloButton;
  @FXML
  private Label helloLabel;
  
  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    System.out.println("StarterController is initialized.");
  }

  @FXML
  protected void handleHelloButtonAction(ActionEvent event) {
    helloLabel.setText("Hello World JavaFX!");
  }
  
}