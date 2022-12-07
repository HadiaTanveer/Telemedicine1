package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class RequestController {
	@FXML
	private Button back;
	@FXML
	private Color x1;
	@FXML
	private Label specName;
	@FXML
	private Button cancel;

	public void setspec(String n) {
		specName.setText(n);
	}
	
	@FXML
	public void goToFindDr(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_FindDoctor(s);
		
	}
	
	public void changeScene_FindDoctor(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("findADoctor.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	

	
}
