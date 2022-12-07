package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DoctorSignUpController {

	private String name;
	private String password;
	private String email;
	private String department;
	private String phoneNum;
	private String availableHrs;
	private String workingDays;
	
	Main m = new Main();
    @FXML
    private Button back;

    @FXML
    private TextField dAvailableHrs;

    @FXML
    private TextField dClinicHrs;//workingdays

    @FXML
    private TextField dEmail;

    @FXML
    private TextField dName;

    @FXML
    private PasswordField dPassword;

    @FXML
    private TextField dPhoneNum;

    @FXML
    private TextField dSpeciality;

    @FXML
    private Hyperlink alreadyReg;

    
    @FXML
    private Button registerDoc;

    @FXML
    void goToMain(ActionEvent event) throws IOException {
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		this.m.changeScene_Menu(s); 
    } //button back

    
    @FXML
    void showDoctorDashboard(ActionEvent event) throws IOException {
    	TelemedicineSystem t = new TelemedicineSystem();
        int d_id = t.d_id;
        System.out.println("id " + d_id);
    	Doctor d = new Doctor(dName.getText(), dPassword.getText(), dEmail.getText(), dSpeciality.getText(), d_id, dPhoneNum.getText(), dAvailableHrs.getText(), dClinicHrs.getText());
    	int doc = d_id;
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorsDashboard.fxml"));
        Parent root = loader.load();
        DoctorsDashboardController dp = loader.getController();
       dp.setID(doc);
       
    	t.d_id++;
    	d.addDoctorsRecord(d);
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_DoctorDasboard(s); 
    }//button registerDoc
    
    public void changeScene_DoctorDasboard(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("DoctorsDashboard.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
    @FXML
    void oToLogin(ActionEvent event) throws IOException {
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_DoctorLogin(s); 
    }
    
    @FXML
    void getDoctorAvailableHrs(ActionEvent event) {
    	this.availableHrs = dAvailableHrs.getText();
    }

    @FXML
    void getDoctorEmail(ActionEvent event) {
    	this.email = dEmail.getText();
    }

    @FXML
    void getDoctorName(ActionEvent event) {
    	this.name = dName.getText();
    }

    @FXML
    void getDoctorPassword(ActionEvent event) {
    	this.password = dPassword.getText();
    }

    @FXML
    void getDoctorPhone(ActionEvent event) {
    	this.phoneNum = dPhoneNum.getText();
    }

    @FXML
    void getDoctorSpeciality(ActionEvent event) {
    	this.department = dSpeciality.getText();
    }

    @FXML
    void getDoctorworkingDays(ActionEvent event) {
    	this.workingDays = dClinicHrs.getText();
    }
    
    public void changeScene_DoctorLogin(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("DoctorLogin.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}//button alreadyReg

}
