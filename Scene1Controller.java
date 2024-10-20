package project2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {
    @FXML
    private TextField nametextfield;
    
    @FXML
    public void login(ActionEvent event) throws IOException {
        String username = nametextfield.getText();
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/project2/scene2.fxml"));
            Parent root = loader.load();
            
            Scene2Controller scene2Controller = loader.getController();
            scene2Controller.displayName(username);
            //for switching between scenes
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not load scene2.fxml");
        }
    }
}