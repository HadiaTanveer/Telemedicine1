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
	public class DoctorLoginController {
		
		Main m = new Main();
		
		@FXML
	    private Button back;
		
	    @FXML
	    private Button dLogin;

	    @FXML
	    private TextField dName;

	    @FXML
	    private PasswordField dPassword;

	    @FXML
	    void doctor_login(ActionEvent event) throws IOException {
	    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Doctor d = new Doctor();
	    	boolean found = false;
	    	for(int i = 0; i < d.doctors_Record.size(); i++) {
	    		d = d.doctors_Record.get(i);
	    		if(d.getD_Name().equalsIgnoreCase(dName.getText())) {
	    			System.out.println(d.getD_Name());
	    			if(d.getD_Password().equalsIgnoreCase(dPassword.getText())) {
	    		
	    		    	found = true;
	    		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorsDashboard.fxml"));
	    		        Parent root = loader.load();
	    		        DoctorsDashboardController dp = loader.getController();
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
	    		changeScene_DoctorDasboard(s);
	    	}
	    	else {
	    		changeScene_Invalid(s);
	    	}
	    }

	    @FXML
	    void getDname(ActionEvent event) {

	    }

	    @FXML
	    void showMenu(ActionEvent event) throws IOException {
	    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
			this.m.changeScene_Menu(s); 
	    }

	    
	    @FXML
	    void getDpassword(ActionEvent event) {

	    }
	    
	    public void changeScene_DoctorDasboard(Stage currentStage) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("DoctorsDashboard.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}
	    
	    public void changeScene_Invalid(Stage currentStage) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("InvalidDoctor.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}

	}
