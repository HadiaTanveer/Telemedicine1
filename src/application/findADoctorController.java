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

public class findADoctorController {
	@FXML
	private Button findDr_spec;
	@FXML
	private Button findDr_Disease;
	@FXML
	private Button back;

	
	@FXML
	public void goToFindDrBySpec(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_findBySpeciality(s);
	}//BY NAME
	
	@FXML
	public void goToFindDrByDisease(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_findByDisease(s);
	}//BY SPECIALITY
	
	@FXML
	public void goToPatientDashboard(ActionEvent event) throws IOException {
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
    
    public void changeScene_findByDisease(Stage currentStage) throws IOException
   	{
   		Parent root = FXMLLoader.load(getClass().getResource("specialities.fxml"));
   		Scene scene = new Scene(root,600,600);
   		currentStage.setScene(scene);
   		currentStage.show();
   		
   	}
    
    public void changeScene_findBySpeciality(Stage currentStage) throws IOException
   	{
   		Parent root = FXMLLoader.load(getClass().getResource("DoctorsNameList.fxml"));
   		Scene scene = new Scene(root,600,600);
   		currentStage.setScene(scene);
   		currentStage.show();
   		
   	}
}
