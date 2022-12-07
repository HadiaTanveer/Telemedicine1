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

public class JoinViaaudioController {
	@FXML
	private Button cancel;
	@FXML
	private Button generate;
	@FXML
	private Button back;
	
	
	@FXML
	public void goToDoctorDashboard(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_DoctorDasboard(s);
	}
	
	@FXML
	public void goToGeneratePrescription(ActionEvent event) {
		
	}
	
	@FXML
	public void goToScheduledAppointments(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_scheduledAppointments(s); 
	}
	
	public void changeScene_DoctorDasboard(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("DoctorsDashboard.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeScene_scheduledAppointments(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("ScheduledAppointments.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}
