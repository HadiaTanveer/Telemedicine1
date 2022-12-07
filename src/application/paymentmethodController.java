package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class paymentmethodController {
	@FXML
	private Button proceed;
	@FXML
	private Button back;
	@FXML
	private Color x1;

	   @FXML
	    void goBack(ActionEvent event) throws IOException {
		   Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
			changeScene_PatientDasboard(s);
	    }
	@FXML
	public void goToPayment(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_billing(s);
	}
	
	public void changeScene_billing(Stage currentStage) throws IOException
	{
    	
		Parent root = FXMLLoader.load(getClass().getResource("billing.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	 public void changeScene_PatientDasboard(Stage currentStage) throws IOException
		{
	    	
			Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}
	
	
	
	
}
