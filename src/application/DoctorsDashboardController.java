package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class DoctorsDashboardController {
	@FXML
	private Button back;
	@FXML
	private Button profile;
	@FXML
	private Button reqAppointments;
	@FXML
	private Button schedApp;
	@FXML
	private Button generateEprescription;
	

	Main m = new Main();
	
	@FXML
	public void showMenu(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		this.m.changeScene_Menu(s); 
	}
	
	
	@FXML
	public void showDoctorProfile(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_DoctorProfile(s); 
	}
	
	@FXML
	public void showReqAppointments(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_reqApp(s); 
	}
	
	@FXML
	public void showScheduledApp(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_scheduledAppointments(s); 
	}
	
	@FXML
	public void showGenerateEprescription(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_eprescription(s); 
	}

	static int id = 0;
	
	 public void setID(int id) {
		
		this.id = id-1;
			
	    }
	
	public void changeScene_DoctorProfile(Stage currentStage) throws IOException
	{
		// TelemedicineSystem t = new TelemedicineSystem();
		 Doctor d = new Doctor();
		 d = d.doctors_Record.get(this.id);
		 System.out.println("id " + this.id);
		 
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Doctors Profile.fxml"));
        Parent root = loader.load();
        DoctorProfileController dp = loader.getController();
       dp.setName(d.getD_Name());
       dp.setEmail(d.getD_Email());
       dp.setNum(d.getD_PhoneNum());
       dp.setSpec(d.getD_Department());
       
       
       loader = new FXMLLoader(getClass().getResource("selectPatient.fxml"));
       Parent r = loader.load();
       selectPatientController sp = loader.getController();
       System.out.println("dpc " + d.getD_Name());
       sp.setdName(d.getD_Name());
      
       String hrs = "";
       for (int h : d.available_hours) {
    	   hrs = hrs + " " + h;
       }
       dp.setHrs(hrs);
       String days = "";
       for (String j : d.working_days) {
    	   days = days + " " + j;
       }
       dp.setDays(days);
      
       Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
		/*Parent root = FXMLLoader.load(getClass().getResource("Doctors Profile.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();*/
		
	}
	
	public void changeScene_eprescription(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("SelectPatient.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeScene_scheduledAppointments(Stage currentStage) throws IOException
	{
		
        
		Doctor d = new Doctor();
		 d = d.doctors_Record.get(this.id);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ScheduledAppointments.fxml"));
       Parent root = loader.load();
       ScheduledAppointmentsController da = loader.getController();
       da.setdName(d.getD_Name());
       da.setdep(d.getD_Department());
       
		//Parent root = FXMLLoader.load(getClass().getResource("ScheduledAppointments.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeScene_reqApp(Stage currentStage) throws IOException
	{
		 Doctor d = new Doctor();
		 d = d.doctors_Record.get(this.id);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorsAppointments.fxml"));
        Parent root = loader.load();
        DoctorsAppointmentsController da = loader.getController();
        da.setdName(d.getD_Name());
        da.setdep(d.getD_Department());
        
		//Parent root = FXMLLoader.load(getClass().getResource("DoctorsAppointments.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}

