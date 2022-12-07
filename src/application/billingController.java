package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class billingController {


    @FXML
    private Button back;

    @FXML
    private Label bill;

    @FXML
    private Label dName;

    @FXML
    private Label pName;

    @FXML
    private Button proceed;

    @FXML
    private Label tax;

    @FXML
    private Label time;

    @FXML
    private Label total;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Color x21;

    @FXML
    private Font x3;

    @FXML
    private Font x31;

    public void setpName(String n) {
    	pName.setText(n);
    }
    
    public void setdName(String n) {
    	dName.setText(n);
    }
    
    public void settime(String n) {
    	
    	time.setText(n);
    }
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	 Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
			changeScene_PatientDasboard(s);
    }

    @FXML
    void proceedToCheckout(ActionEvent event) throws IOException {
    	Stage s = (Stage)((Node)event.getSource()).getScene().getWindow();
		changeScene_lastbillingpage(s);
    }
    
    public void changeScene_lastbillingpage(Stage currentStage) throws IOException
	{
    	
		Parent root = FXMLLoader.load(getClass().getResource("lastbillingpage.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}
    
    public void changeScene_PatientDasboard(Stage currentStage) throws IOException
	{
    	
		Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
		Scene scene = new Scene(root,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
	}


}
