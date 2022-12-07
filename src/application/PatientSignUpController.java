package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientSignUpController {
	@FXML
	private TextField pname;
	@FXML
	private PasswordField ppassword;
	@FXML
	private TextField pEmail;
	@FXML
	private TextField pAge;
	@FXML
	private ComboBox gender;
	@FXML
	private Hyperlink pHyperlink;
	@FXML
	private Button pRegister;
    @FXML
    private Button back;


	Main m = new Main();
	static TelemedicineSystem t = new TelemedicineSystem();
	
	@FXML
	public void getPname(ActionEvent event) {
		//Stage mainWindow = (Stage)pname.getScene().getWindow();
		
	}
	
	@FXML
	public void getPpassword(ActionEvent event) {
		
	}

	@FXML
	public void getPemail(ActionEvent event) {
	
	}

	@FXML
	public void getP_age(ActionEvent event) {
	
	}
	
	//static int in = 0;
	@FXML
	public void alreadyReg(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_PatientLogin(s);
	
	}
	//PatientProfileController p = new PatientProfileController();
	static int id = 1;
	@FXML
	public void registerPatient(ActionEvent event) throws IOException {
        System.out.println("id " + this.id);
        
    	Patient p = new Patient( pname.getText(), ppassword.getText(),  pAge.getText(), this.id, pEmail.getText());
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
        Parent root = loader.load();
        dashboardController dp = loader.getController();
       dp.setID(id);
    	id++;
    	p.addPatientsRecord(p);

		//p.num = i;
		//this.in = i;
		//Patient p = new Patient();
		//p = p.patients_Record.get(0);
		//System.out.println(p.getpName() + p.getpPassword());
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_PatientDasboard(s);
	
	}
	public void changeScene_PatientLogin(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("PatientLogin.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	 @FXML
	    void showMenu(ActionEvent event) throws IOException {
			Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
			this.m.changeScene_Menu(s); 
	    }
	 public void changeScene_PatientDasboard(Stage currentStage) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}

}
