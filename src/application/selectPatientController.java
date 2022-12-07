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
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.StringTokenizer;


public class selectPatientController implements Initializable{

	
	  @FXML
	    private ListView<String> view;
	
    @FXML
    private Button back;

    @FXML
    private Button done;

    String current;
    
    static int d_id = 0;
	static int id = 0;
	 public void setID(int id) {
		
		this.d_id = id-1;
			
	 }
	 static String dName;
	 static String pName;
	 
	 
	 public void setdName(String n) {
		 System.out.println("setdname " + n);
			this.dName = n;
				
		 }
    
    @FXML
    void generatePrescription(ActionEvent event) throws IOException {
    
    	
    	
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_eprescription(s); 
    }

    public void changeScene_eprescription(Stage currentStage) throws IOException
	{
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("DataEntryForGeneratePrescriptions.fxml"));
        Parent root = loader.load();
        DataEntryForGeneratePrescriptionsController dd = loader.getController();
    	selectPatientController pp = new selectPatientController();
        System.out.println("HHHHHHH");
		System.out.println(id);
		System.out.println(pp.pName);
		System.out.println(pp.dName);
       dd.setID(id);
       
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();  
       dd.setDate(dtf.format(now));  
       dd.setpName(pp.pName);
       
       dd.setdName(pp.dName);
       //Parent root = FXMLLoader.load(getClass().getResource("DataEntryForGeneratePrescriptions.fxml"));
		
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	Patient p = new Patient();
    ArrayList <String> patients= new ArrayList<String>();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

	
		for(int i = 0; i < p.patients_Record.size(); i++) {
			p = p.patients_Record.get(i);
			String name = p.getpName();
			int id = p.getpId();
			String pat = id + ". " + name;
			patients.add(pat);
			
		}
		view.getItems().addAll(patients);
		
		view.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				
				current = view.getSelectionModel().getSelectedItem();
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
		      System.out.println("Current Patient " + p.patients_Record.get(id-1).getpName());
		      selectPatientController pp = new selectPatientController();
		      pp.pName = p.patients_Record.get(id-1).getpName();
		     pp.id = id;
		      
			}	
		});
	}
    
    @FXML
    void showMenu(ActionEvent event) throws IOException {
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
}
