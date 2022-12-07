package application;


	import java.io.IOException;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
	import javafx.scene.control.PasswordField;
	import javafx.scene.control.TextField;
import javafx.stage.Stage;
	
	public class PatientLoginController {
		
		PatientProfileController p = new PatientProfileController();
		TelemedicineSystem t =  new TelemedicineSystem();
		Main m = new Main();
		
	    @FXML
	    private Button pLogin;
	    
	    @FXML
	    private Button back;


	    @FXML
	    private TextField pName;

	    @FXML
	    private PasswordField pPassword;

	    @FXML
	    void getPname(ActionEvent event) {

	    }

	   // static int i = 0;
	    
	    @FXML
	    void getPpassword(ActionEvent event) {

	    }

	    @FXML
	    void patientLogin(ActionEvent event) throws IOException {
	    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Patient p = new Patient();
	    	boolean found = false;
	    	for(int i = 0; i < p.patients_Record.size(); i++) {
	    		p = p.patients_Record.get(i);
	    		if(p.getpName().equalsIgnoreCase(pName.getText())) {
	    			//System.out.println(d.getD_Name());
	    			if(p.getpPassword().equalsIgnoreCase(pPassword.getText())) {
	    		    	found = true;
	    		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
	    		        Parent root = loader.load();
	    		        dashboardController dp = loader.getController();
	    		      i++;
	    		        dp.setID(i);
	    		    	break;
	    			}
	    			else {
	    				
	    				found = false;
	    			}
	    		}
	    		else {
	    			
	    			found = false;
	    		}
	    	}
	    	if(found == true) {
	    		changeScene_PatientDasboard(s);
	    	}
	    	else {
	    		changeScene_InvalidPatient(s);
	    	}
	    }
	    @FXML
	    void showMenu(ActionEvent event) throws IOException {
	    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
			this.m.changeScene_Menu(s); 
	    }
	    
	    public void changeScene_InvalidPatient(Stage currentStage) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("InvalidLogin.fxml"));
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
