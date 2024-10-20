package project2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
@FXML
Label namelabel;
public void displayName(String username) {
	namelabel.setText("Hello" + username);
}
}
