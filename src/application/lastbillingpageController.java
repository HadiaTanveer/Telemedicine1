package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class lastbillingpageController {
	@FXML
	private Button back;
	  @FXML
	    private Button back1;
	// Event Listener on Button[#back].onAction
	@FXML
	public void goBack(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_PatientDasboard(s);
	}
	
	public void changeScene_PatientDasboard(Stage currentStage) throws IOException
	{
    	
		Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}
