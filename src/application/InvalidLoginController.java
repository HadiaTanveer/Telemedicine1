package application;



	import java.io.IOException;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

	public class InvalidLoginController {

	    @FXML
	    private Button retry;

	    @FXML
	    void retryLoginPatient(ActionEvent event) throws IOException {
	    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	changeScene_PatientLogin(s);
	    }

	    public void changeScene_PatientLogin(Stage currentStage) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("PatientLogin.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}
	}

