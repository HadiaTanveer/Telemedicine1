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

public class ScheduledAppointmentsController implements Initializable{

    @FXML
    private Button audio1;

    @FXML
    private Button back;

    @FXML
    private Label dName;

    @FXML
    private Label dep;

    @FXML
    private ListView list;

    @FXML
    private Button video1;
    @FXML
    void goToDrDashboard(ActionEvent event) throws IOException {
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_DoctorDasboard(s);
    }

    @FXML
    void joinAudio1(ActionEvent event) throws IOException {
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_Audio(s);
    }

  

    @FXML
    void joinVideo1(ActionEvent event) throws IOException {
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
    	changeScene_Video(s);
    }

    public void setdName(String n) {
		dName.setText(n);
	}
	
	public void setdep(String n) {
		dep.setText(n);
	}
	
static appointment a = new appointment();
	String current;
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
    for(int i = 0; i < p.appointmentConfirm.size(); i++) {
    	a = p.appointmentConfirm.get(i);
    	if(a.getAppPatientID() >= 0) {
    		int l = a.getAppDrID();
			Doctor pp = p.doctors_Record.get(l);
			String name = pp.getD_Name();
			int pId = a.getAppPatientID();
			Patient pt = new Patient();
					pt = pt.patients_Record.get(pId);
					
			String pName = pt.getpName();
			String time = a.getAppTime();
			
			String pat = pId + ".     \t\t\t\t   \t" + pName + "  \t\t \t  \t\t " + time ;
			app.add(pat);
			//}
    	}
		}
    
   // 
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
		          dn.dname = p.doctors_Record.get(id).getD_Name();
		          dn.dspec = p.doctors_Record.get(id).getD_Department();
		          dn.dID = id-1;
		      System.out.println("Current Patient " + p.doctors_Record.get(id-1).getD_Name());
		   
			}	
		});
	}
  
    public void changeScene_DoctorDasboard(Stage currentStage) throws IOException
   	{
   		Parent root = FXMLLoader.load(getClass().getResource("DoctorsDashboard.fxml"));
   		Scene scene = new Scene(root,600,600);
   		currentStage.setScene(scene);
   		currentStage.show();
   		
   	}
    
    public void changeScene_Audio(Stage currentStage) throws IOException
   	{
   		Parent root = FXMLLoader.load(getClass().getResource("JoinViaaudio.fxml"));
   		Scene scene = new Scene(root,600,600);
   		currentStage.setScene(scene);
   		currentStage.show();
   		
   	}
    public void changeScene_Video(Stage currentStage) throws IOException
   	{
   		Parent root = FXMLLoader.load(getClass().getResource("VideoCall.fxml"));
   		Scene scene = new Scene(root,600,600);
   		currentStage.setScene(scene);
   		currentStage.show();
   		
   	}

}

