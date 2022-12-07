package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class specialitiesController {
	@FXML
	private Button back;
	@FXML
	private Button paediatrics;
	@FXML
	private Button otorhin;
	@FXML
	private Button cardio;
	@FXML
	private Button nephro;

	static String speciality;
	
	@FXML
	public void goToFindDoctor(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_FindDoctor(s);
	}
	
	@FXML
	public void peads(ActionEvent event) throws IOException {
		 this.speciality = "Paediatrics";
	       System.out.println("llala" + this.speciality);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Paeds.fxml"));
        Parent root = loader.load();
        PaedsController dp = loader.getController();
       dp.setspec("Paediatrics");
       PaedsController p = new PaedsController();
      
       Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
       changeScene_paeds(s, root);
	}
	
	@FXML
	public void goToOtorhin(ActionEvent event) throws IOException {
		this.speciality = "Otorhinolaryngology";
	       System.out.println("llala" + this.speciality);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Paeds.fxml"));
        Parent root = loader.load();
        PaedsController dp = loader.getController();
       dp.setspec("Otorhinolaryngology");
       PaedsController p = new PaedsController();
       
       Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
       changeScene_paeds(s, root);
	}
	
	@FXML
	public void cardiology(ActionEvent event) throws IOException {
		  this.speciality = "Cardiology";
	       System.out.println("llala" + this.speciality);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Paeds.fxml"));
        Parent root = loader.load();
        PaedsController dp = loader.getController();
       dp.setspec("Cardiology");
       PaedsController p = new PaedsController();
     
       Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
       changeScene_paeds(s, root);
	}
	
	@FXML
	public void nephrology(ActionEvent event) throws IOException {
		this.speciality = "Nephrology";
	       System.out.println("llala" + this.speciality);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Paeds.fxml"));
        Parent root = loader.load();
        PaedsController dp = loader.getController();
       dp.setspec("Nephrology");
       PaedsController p = new PaedsController();
       
       Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
       changeScene_paeds(s, root);
	}
	
	public void changeScene_paeds(Stage currentStage, Parent root) throws IOException
	{
		//Parent root = FXMLLoader.load(getClass().getResource("findADoctor.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeScene_FindDoctor(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("findADoctor.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}
