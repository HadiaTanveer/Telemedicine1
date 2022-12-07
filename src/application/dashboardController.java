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

public class dashboardController {
	@FXML
	private Button back;
	@FXML
	private Button profile;
	
	 @FXML
	    private Button bill;
	@FXML
	private Button eprescription;
	@FXML
	private Button findDoc;

	Main m = new Main();
	

	static int id = 0;
	
	 public void setID(int id) {
		
		this.id = id-1;
			
	    }
	
	
	@FXML
	public void showMenu(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		this.m.changeScene_Menu(s); 
	}
	
	@FXML
	public void showPatientProfile(ActionEvent event) throws IOException {
		
		
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScenePatientProfile(s);
	}
	
	 
    public void changeScenePatientProfile(Stage currentStage) throws IOException
	{
		
		 Patient p = new Patient();
		 p = p.patients_Record.get(this.id);
		 System.out.println("id " + this.id);
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("billing.fxml"));
	        Parent root = loader.load();
	       billingController b = loader.getController();
	       b.setpName(p.getpName());
	       appointment a = new appointment();
	       Doctor d = new Doctor();
	       if(d.appointmentConfirm.size() > 0) {
	    	   for(int i = 0; i < d.appointmentConfirm.size() ; i++) {
	    	   a = d.appointmentConfirm.get(i);
	    	   int ii = a.getAppDrID();
	    	   String n = d.doctors_Record.get(ii).getD_Name();
		       b.setdName(n);
	    	   }
		      // b.settime(null);
	       }
		 loader = new FXMLLoader(getClass().getResource("PatientProfile.fxml"));
         root = loader.load();
        PatientProfileController dp = loader.getController();
       dp.setName(p.getpName());
       dp.setEmail(p.getpEmail());
       dp.setAge(p.getpAge());
       dp.setID(p.getpId());
		
		Scene scene = new Scene(root,600,600);
		Stage mainWindow = (Stage)scene.getWindow();
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	
	
	@FXML
	public void viewEprescription(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_PatientEprescription(s);
	}
	
	@FXML
	public void findDoctor(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_FindDoctor(s);
	}
	
	 @FXML
	    void goToBill(ActionEvent event) throws IOException {
		 Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
			changeScene_Bill(s);
	    }
	
	 public void changeScene_Bill(Stage currentStage) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("paymentmethod.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}
	 
	public void changeScene_PatientEprescription(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("e-prescription.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	public void changeScene_FindDoctor(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("findADoctor.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeScene_bookAppointment(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("book appointment.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}
