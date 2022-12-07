package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class RoughController {

	Main m = new Main();

	@FXML
	public void btnOnClick(ActionEvent event) throws IOException 
	{
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_Menu(s);
	}
	
	public void changeScene_Menu(Stage currentStage) throws IOException
	{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("Rough2.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}
