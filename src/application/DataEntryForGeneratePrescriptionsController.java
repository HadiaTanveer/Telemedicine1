package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
public class DataEntryForGeneratePrescriptionsController {
	 @FXML
	    private Button cancel;

	    @FXML
	    private Label dName;
	    @FXML
	    private Button show;
	    @FXML
	    private Label date;

	    @FXML
	    private Button generate;

	 

	    @FXML
	    private TextField medicines;

	    @FXML
	    private Label pName;

	    @FXML
	    private TextArea prescription;

	  static int id = 0;
		
		 public void setID(int id) {
			
			this.id = id-1;
				
		 }
		 
		 public void setDate(String d) {
				date.setText(d);
					
			 }
		 
		 public void setpName(String n) {
				pName.setText(n);
					
			 }
		 public void setdName(String n) {
				dName.setText(n);
					
			 }
	@FXML
	public void generateEprescription(ActionEvent event) throws IOException {
		
        
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_PatientEprescription(s);
	}
	public void changeScene_PatientEprescription(Stage currentStage) throws IOException
	{
		
		 selectPatientController sp = new selectPatientController();
			
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("e-prescription.fxml"));
        Parent root = (Parent)loader.load();
        ePrescriptionController dp = loader.getController();
        dp.setpName(sp.pName);
        dp.setdName(sp.dName);
		//Parent root = FXMLLoader.load(getClass().getResource("e-prescription.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	
	@FXML
	public void goToDrDashboard(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_DoctorDasboard(s);
	}
	public void changeScene_DoctorDasboard(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("DoctorsDashboard.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
    @FXML
    void unhide(ActionEvent event) {
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
      selectPatientController s = new selectPatientController();
         setDate(dtf.format(now));
        setdName(s.dName);
        setpName(s.pName);
        int id = s.id;
    }
}
