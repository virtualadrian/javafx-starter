package gs.marshall.javafxstarter.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StarterApplication extends Application {
  
  @Override
  public void start(Stage primaryStage) throws Exception {
      primaryStage.setTitle("Java FX Starter");
      Pane pane = (Pane)FXMLLoader.load(getClass().getResource("starter-application.fxml"));
      Scene scene = new Scene(pane);
      primaryStage.setScene(scene);
      primaryStage.show();
  }

  public static void main(String[] args) {
      launch(args);
  }
}