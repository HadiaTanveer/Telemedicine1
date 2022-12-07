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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class DoctorsAppointmentsController implements Initializable{
	@FXML
	private Button back;
	@FXML
	private Label dName;
	@FXML
	private Label dep;
	@FXML
	private Button reject;
	@FXML
	private Button accept;
	@FXML
	private ListView list;

	String current;
	
	public void setdName(String n) {
		dName.setText(n);
	}
	
	public void setdep(String n) {
		dep.setText(n);
	}
	
	static appointment a = new appointment();
	Doctor p = new Doctor();
	ArrayList<String> app = new ArrayList <String>();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorsDashboard.fxml"));
		
		
	
	
    try {
		Parent root = loader.load();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    //specialitiesController s = loader.getController();

	DoctorsDashboardController dd = loader.getController();
	p = p.doctors_Record.get(dd.id);
	System.out.println("id app " + dd.id);	
   appointment a = p.getA();
   
   int size = p.appointmentRequest.size();
    for(int i = 0; i < size; i++) {
    	//a = p.getA();
    	a =  p.appointmentRequest.get(i);
    	System.out.println("OUTSIDE IF PATIENT ID " + a.getAppPatientID() + " SIZE " +  p.appointmentRequest.size() + " i " + i);
    	if(a.getAppPatientID() >= 0) {
			int l = a.getAppDrID();
			Doctor pp = p.doctors_Record.get(l);
			String name = pp.getD_Name();
			int pId = a.getAppPatientID();
			Patient pt = new Patient();
					pt = pt.patients_Record.get(pId);
					int h = pId;
					System.out.println("IDS OF PATIENTS : " + h + " SIZE " +  p.appointmentRequest.size() + " i " + i);
			String pName = pt.getpName();
			String time = a.getAppTime();
			DoctorsAppointmentsController da = new DoctorsAppointmentsController();
			da.a = a;
			
			String pat = pId + ".     \t\t\t\t   \t" + pName + "  \t\t \t  \t\t " + time ;
			app.add(pat);
			
    	}
		}
   
		list.getItems().addAll(app);
		
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
		          Patient pp = new Patient();
		          pp = pp.patients_Record.get(id);
		          dn.dname = p.doctors_Record.get(id).getD_Name();
		          dn.dspec = p.doctors_Record.get(id).getD_Department();
		          dn.dID = id-1;
		      
		      Doctor p = new Doctor();
		  	DoctorsDashboardController dd = loader.getController();
		  	p = p.doctors_Record.get(dd.id);
		      p = p.doctors_Record.get(dd.id);
		      appointment a = new appointment();
		      for(int i = 0; i < p.appointmentRequest.size(); i++) {
		    	  a = p.appointmentRequest.get(i);
		    	  int idd = a.getAppPatientID();
		    	  if(id == idd) {
		    		  DoctorsAppointmentsController da = new DoctorsAppointmentsController();
		    		  System.out.println("Current Patient " + pp.getpName());
		    		 da.a = a;
		    	  }
		      }
		      //selectPatientController pp = new selectPatientController();
		      //pp.pName = p.patients_Record.get(id-1).getpName();
		     //pp.id = id;
		      
			}	
		});
	}
	
	
	@FXML
	public void goToDrDashboard(ActionEvent event) throws IOException {
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_DoctorDasboard(s);
	}
	
	 public void changeScene_DoctorDasboard(Stage currentStage) throws IOException
		{
	    
			Parent root = FXMLLoader.load(getClass().getResource("DoctorsDashboard.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}
	 
	@FXML
	public void appointmentConfirm(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorsDashboard.fxml"));
		 Doctor p = new Doctor();
			DoctorsDashboardController dd = loader.getController();
			Parent root = loader.load();
			p = p.doctors_Record.get(dd.id);
			appointment aa = this.a;
			System.out.println("id app " + dd.id);	
			appointment ap = new appointment();
			for(int i = 0; i < p.appointmentRequest.size(); i++) {
	        	ap = p.appointmentRequest.get(i);
	        	System.out.println(" REQUEST 1  Dr. ID: " + ap.getAppDrID() + " Patient ID: " + ap.getAppPatientID());
	        }
		p.appointmentConfirm.add(aa);
		//a = p.appointmentRequest.indexOf(a);
		//check aa name of patient
		//patient being added and removed are not same
		//removes last person in array always
		//adds first person in array
		//does not display last person of array
		p.appointmentRequest.remove(aa);
		for(int i = 0; i < p.appointmentRequest.size(); i++) {
        	ap = p.appointmentRequest.get(i);
        	System.out.println(" REQUEST 2   Dr. ID: " + ap.getAppDrID() + " Patient ID: " + ap.getAppPatientID());
        }
		
		for(int i = 0; i < p.appointmentConfirm.size(); i++) {
        	ap = p.appointmentConfirm.get(i);
        	System.out.println("CONFIRM Dr. ID: " + ap.getAppDrID() + " Patient ID: " + ap.getAppPatientID());
        }
		//d.setA(a);
		Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_doctorsApp(s);
	}
	
	 public void changeScene_doctorsApp(Stage currentStage) throws IOException
		{
	    
			Parent root = FXMLLoader.load(getClass().getResource("DoctorsAppointments.fxml"));
			Scene scene = new Scene(root,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
		}
}
