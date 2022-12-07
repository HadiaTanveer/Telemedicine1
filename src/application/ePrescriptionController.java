package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ePrescriptionController {

    @FXML
    private Button back;
    @FXML
    private Label dName;

    @FXML
    private Label pName;

   
    static int id = 0;
	
	 public void setID(int id) {
		
		this.id = id-1;
			
	    }
	 
	 public void setpName(String n) throws IOException {
		 System.out.println("setpname" + n);
		 
			pName.setText(n);
			System.out.println();
		 }
	 public void setdName(String n) {
		 System.out.println("setdname kkk" + n);
			dName.setText(n);
			System.out.println(dName.getText());
				
		 }
    @FXML
    void goToPatientDashboard(ActionEvent event) throws IOException {
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
}
