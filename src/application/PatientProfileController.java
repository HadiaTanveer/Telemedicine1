package application;



	import java.io.IOException;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;
import javafx.stage.Stage;

	public class PatientProfileController {
		  Main m = new Main();

		  
		TelemedicineSystem t = new TelemedicineSystem();
	    @FXML
	    private Button LogOut;

	    @FXML
	    private Label Name;

	    @FXML
	    private Label age;

	    @FXML
	    private Label email;

	    @FXML
	    private Label id;

	    public void setName(String name) {
	        Name.setText(name);
	    }
	    
	    public void setEmail(String name) {
	        email.setText(name);
	    }
	    
	    public void setAge(String name) {
	        age.setText(name);
	    }
	    
	    public void setID(int name) {
	    	String s = Integer.toString(name);
	    	id.setText(s);
	    }
	    
	    @FXML
	    void GoToMain(ActionEvent event) throws IOException {
	    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	changeScene_PatientDasboard(s);
	    }

	    static String pName;
	    static String pPhone;

	    DoctorProfileController d = new DoctorProfileController();
	    
	    public void changeScenePatientProfile(Stage currentStage) throws IOException
		{
			
			Parent root = FXMLLoader.load(getClass().getResource("PatientProfile.fxml"));
			Scene scene = new Scene(root,600,600);
			Stage mainWindow = (Stage)scene.getWindow();
			currentStage.setScene(scene);
			currentStage.show();
			
		}
	    
	    public void changeScene_PatientDasboard(Stage currentStage) throws IOException
		{
	    	this.pName = Name.getText();
			this.pPhone = id.getText();
			System.out.print("ll " + this.pName + " " + this.pPhone + " g" + Name.getText());
			Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}
	    
}
