package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class PaedsController  implements Initializable{
	@FXML
	private Button back;
	@FXML
	private Color x1;
	@FXML
	private ListView list;
	@FXML
	private Button select;
	@FXML
	private Label specName;


    @FXML
    private Button cancel;
    
	public void setspec(String n) {
		specName.setText(n);
	}
	
	String current;
	static String dname;
    static String dspec;
    static int dID;
	
	@FXML
	public void goToFindDr(ActionEvent event) throws IOException {
		
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_FindDoctor(s);
	}

	public void changeScene_FindDoctor(Stage currentStage) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("specialities.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	Doctor p = new Doctor();
	ArrayList <String> dr= new ArrayList<String>();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

	//specialitiesController s = new specialitiesController();
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("specialities.fxml"));
    try {
		Parent root = loader.load();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    specialitiesController s = loader.getController();
		for(int i = 0; i < p.doctors_Record.size(); i++) {
			System.out.println("Department " + p.getD_Department());
			System.out.println("label " + s.speciality);
			p = p.doctors_Record.get(i);
			String name = p.getD_Name();
			if(p.getD_Department().equalsIgnoreCase(s.speciality)) {
				System.out.println("Department vvv " + specName.getText());
			int id = p.getD_Id();
			String availability = " ";
			for(int j =0; j < p.working_days.size(); j++) {
				
				availability = p.working_days.get(j);
			}
			
			String pat = id + ".        " + p.getD_Department() + "   \t  \t\t " + name + "   \t  \t\t" + availability;
			dr.add(pat);
			}
			
		}
		list.getItems().addAll(dr);
		
		list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				
				current = (String) list.getSelectionModel().getSelectedItem();
				
				StringTokenizer multiTokenizer  = new StringTokenizer(current, ".");
				int m = 0;
				int id = 0;
		          while (multiTokenizer.hasMoreTokens()) {
		        	  if(m == 0)
		        	  {
		        		   id = Integer.parseInt(multiTokenizer.nextToken());
		        		   System.out.println("d "+ id );
		        		   break;
		        	  }
		        	
		          }
		          PaedsController dn = new PaedsController();
		          dn.dname = p.doctors_Record.get(id-1).getD_Name();
		          dn.dspec = p.doctors_Record.get(id-1).getD_Department();
		          dn.dID = id-1;
		      System.out.println("Current Patient " + p.doctors_Record.get(id-1).getD_Name());
		      //selectPatientController pp = new selectPatientController();
		      //pp.pName = p.patients_Record.get(id-1).getpName();
		     //pp.id = id;
		      
			}	
		});
	}
	
	@FXML
	public void selectDoctor(ActionEvent event) throws IOException {
		
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_bookAppointment(s);
	}
	 public void changeScene_bookAppointment(Stage currentStage) throws IOException
		{
			
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("book appointment.fxml"));
	        Parent root = loader.load();
	        bookAppointmentController dp = loader.getController();
	       dp.setName(this.dname);
	       dp.setDrID(this.dID);
	       dp.setSpec(this.dspec);
	       System.out.println("nnn " + this.dname + "  " + this.dspec);
	       PatientProfileController pp = new PatientProfileController();
	       dp.setpName(pp.pName);
	       dp.setID( Integer. parseInt(pp.pPhone));
	       
	       System.out.println("ppp " + pp.pName + " " + pp.pPhone);
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}

	
	
}
