package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

public class bookAppointmentController {
	 @FXML
	    private Button appointmentRequest;

	    @FXML
	    private Button back;

	    @FXML
	    private TextArea condition;

	    @FXML
	    private TextArea currentPrescr;

	    @FXML
	    private TextField dateOfConsultation;

	    @FXML
	    private Label departmentName;

	    @FXML
	    private Label doctorName;

	    @FXML
	    private TextField history;

	    @FXML
	    private Label patientName;

	    @FXML
	    private Label phoneNum;
	@FXML
	private Button time1;
	@FXML
	private Button time2;
	@FXML
	private Button time3;
	@FXML
	private Button time4;
	@FXML
	private Button time5;
	@FXML
	private Button time6;
	

	@FXML
	public void sendAppointmentRequest(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_request(s);
	}
		@FXML
	public void goToFindDoctor(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_FindDoctor(s);
	}
	
	@FXML
	public void chooseTime1(ActionEvent event) {
		
	}
	
	@FXML
	public void chooseTime2(ActionEvent event) {
		
	}
	
	@FXML
	public void chooseTime3(ActionEvent event) {
		
	}
	
	@FXML
	public void chooseTime4(ActionEvent event) {
		
	}
	
	@FXML
	public void chooseTime5(ActionEvent event) {
		
	}
	
	@FXML
	public void chooseTime6(ActionEvent event) {
		
	}
	
	@FXML
	public void choose_audio(ActionEvent event) {
		
	}

	@FXML
	public void chooseVideo(ActionEvent event) {
	
	}
	
	@FXML
	public void chooseChat(ActionEvent event) {
		
	}
	
	public void setName(String name) {
		this.dname = name;
        doctorName.setText(name);
    }
	
	public void setDrID(int name) {
		
		this.id = name;
		//String n = Integer.toString(name);
        //doctorName.setText(n);
    }
	
	
	public void setpName(String name) {
		
        patientName.setText(name);
    }
	
	public void setID(int name) {
		this.pid = name;
		String n = Integer.toString(name);
        phoneNum.setText(n);
    }
	public void setSpec(String name) {
    	departmentName.setText(name);
    }
	
	static String dname;
	static int id;//dr
	static int pid;
	public void changeScene_FindDoctor(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("findADoctor.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
	public void changeScene_request(Stage currentStage) throws IOException
	{
		Doctor d = new Doctor();
		d = d.doctors_Record.get(this.id);
		System.out.println("book dr id " + this.id);
		int ii = this.pid - 1;
		System.out.println("book p id " + ii);
		appointment a = new appointment(this.id, "3:14", ii);
		d.appointmentRequest.add(a);
		d.setA(a);
		
        for(int i = 0; i < d.appointmentRequest.size(); i++) {
        	a = d.appointmentRequest.get(i);
        	System.out.println("IN REQUESTED  Dr. ID: " + a.getAppDrID() + " Patient ID: " + a.getAppPatientID());
        }
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("Request.fxml"));
         Parent root = loader.load();
        RequestController dp = loader.getController();
       //dp.setName(this.dname);
       dp.setspec(this.dname);
		//Parent root = FXMLLoader.load(getClass().getResource("Request.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
}
