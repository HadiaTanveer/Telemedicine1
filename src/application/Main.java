package application;
	
import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Rough.fxml"));
			Scene scene = new Scene(root,600,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Hello world!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TelemedicineSystem t = new TelemedicineSystem();
		t.addDoctorRecord();
		launch(args);
	}
	
	public void changeScene_Menu(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("Rough.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}

	/*public void changeSceneP(Stage currentStage) throws IOException
	{
		
		
		Parent root = FXMLLoader.load(getClass().getResource("Rough2.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	public void changeSceneDoctor(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("DoctorSignup.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeSceneDoctorProfile(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("Doctors Profile.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeScenePatientDashboard(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("Doctors Profile.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	public void changeSceneDoctorDashboard(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("Doctors Profile.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	public void changeScenePatient(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("PatientSignUp.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	public void changeScenePatientLogin(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("PatientLogin.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	public void changeSceneDoctorLogin(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("DoctorLogin.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show(); 
		
	}
	public void changeSceneInvalidPatient(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("InvalidLogin.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}*/
	
	/*public void changeScenePatientProfile(Stage currentStage) throws IOException
	{
		
		Parent root = FXMLLoader.load(getClass().getResource("PatientProfile.fxml"));
		Scene scene = new Scene(root,600,600);
		Patient p = new Patient();
		p = p.patients_Record.get(0);
		
		currentStage.setScene(scene);
		currentStage.show();
		
	}*/
	
}
