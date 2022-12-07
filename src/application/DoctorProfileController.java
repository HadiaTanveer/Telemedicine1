package application;

	import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DoctorProfileController {


    @FXML
    private Button cross;

    @FXML
    private Label dAvailableHrs;

    @FXML
    private Label dClinicAddress;

    @FXML
    private Label dEmail;

    @FXML
    private Label dName;

    @FXML
    private Label dNum;

    @FXML
    private Label dSpecialization;



    public void setName(String name) {
        dName.setText(name);
    }
    
    public void setEmail(String name) {
        dEmail.setText(name);
    }
    
    public void setNum(String name) {
        dNum.setText(name);
    }
    
    public void setSpec(String name) {
    	dSpecialization.setText(name);
    }
    
    public void setHrs(String available_hours) {
    	dAvailableHrs.setText(available_hours);
    }
    
    public void setDays(String name) {
    	dClinicAddress.setText(name);
    }
    @FXML
    void showDoctorDashboard(ActionEvent event) throws IOException {
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

}

