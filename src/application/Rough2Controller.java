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

public class Rough2Controller {
	@FXML
	private Button btnD;
	private Button btnP;

	Main m = new Main();
	
	@FXML
	public void switchscreen(ActionEvent event) throws IOException 
	{
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_DoctorSignUp(s); 
	}
	
	public void switchPatient(ActionEvent event) throws IOException 
	{
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_PatientSignUp(s);
	}
	
	public void changeScene_DoctorSignUp(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("DoctorSignUp.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
	}
	
	public void changeScene_PatientSignUp(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("PatientSignUp.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}
