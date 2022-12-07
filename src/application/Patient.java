package application;

import java.util.ArrayList;

public class Patient {

	private String pName;
	private String pPassword;
	private String pAge;
	private int pId;
	private String pEmail;
	private appointment a;
	
	public Patient( appointment a) {
		
		this.a = a;
	}
	static ArrayList <Patient> patients_Record= new ArrayList<Patient>();
	
	public Patient(String pName, String pPassword, String pAge, int pId, String pEmail) {
		this.pName = pName;
		this.pPassword = pPassword;
		this.pAge = pAge;
		this.pId = pId;
		this.pEmail = pEmail;
	}
	
	
public void addPatientsRecord(Patient p) {
		
		patients_Record.add(p);
	}
	

	public Patient() {
		
	}
	
	public appointment getA() {
		return a;
	}


	public void setA(appointment a) {
		this.a = a;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpPassword() {
		return pPassword;
	}
	public void setpPassword(String pPassword) {
		this.pPassword = pPassword;
	}
	public String getpAge() {
		return pAge;
	}
	public void setpAge(String pAge) {
		this.pAge = pAge;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	
	
	
}
