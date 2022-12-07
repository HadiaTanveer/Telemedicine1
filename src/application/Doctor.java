package application;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Doctor {

	private String d_Name;
	private String d_Password;
	private String d_Email;
	private String d_Department;
	private String d_PhoneNum;
	private int d_Id;
	private appointment a;
	

	ArrayList <Integer> available_hours = new ArrayList<Integer>();
	ArrayList <String> working_days = new ArrayList<String>();
	static ArrayList <Doctor> doctors_Record= new ArrayList<Doctor>();
	static ArrayList <appointment> appointmentRequest= new ArrayList<appointment>();
	static ArrayList <appointment> appointmentConfirm= new ArrayList<appointment>();
	
	
	public static ArrayList<appointment> getAppointmentRequest() {
		return appointmentRequest;
	}

	public static void setAppointmentRequest(ArrayList<appointment> appointmentRequest) {
		Doctor.appointmentRequest = appointmentRequest;
	}
	

	
	public Doctor() {
		
	}
	
	public Doctor(String d_Name, String d_Password, String d_Email, String d_Department, int d_Id, 
			String d_pn, String availableHrs, String workingDays) {
		super();
		this.d_Name = d_Name;
		this.d_Password = d_Password;
		this.d_Email = d_Email;
		this.d_Department = d_Department;
		this.d_Id = d_Id;
		this.d_PhoneNum = d_pn;
		String hrs = availableHrs;
		String days = workingDays;
		appointment a = new appointment();
	this.setA(a);
		this.setAppointmentRequest(appointmentRequest);
		
		StringTokenizer multiTokenizer  = new StringTokenizer(hrs, ",");
          while (multiTokenizer.hasMoreTokens()) {
        		  available_hours.add(Integer.parseInt(multiTokenizer.nextToken()));
          }
        
          multiTokenizer  = new StringTokenizer(days, ",");
          while (multiTokenizer.hasMoreTokens()) {
        		  working_days.add(multiTokenizer.nextToken());
          }
          
	}
	
	public Doctor(appointment a) {
		this.a = a;
	}
	
	public Doctor(String availableHrs, String workingDays) {
		String hrs = availableHrs;
		String days = workingDays;
		System.out.println("Hello" + hrs);
		StringTokenizer multiTokenizer  = new StringTokenizer(hrs, ",");
          while (multiTokenizer.hasMoreTokens()) {
        		  available_hours.add(Integer.parseInt(multiTokenizer.nextToken()));
          }
          System.out.println("Available Hours:");
          for(int i = 0; i < available_hours.size(); i++) {
        	  System.out.println(available_hours.get(i));
          }
	}
	
	public void addDoctorsRecord(Doctor d) {
		
		doctors_Record.add(d);
	}
	
	public appointment getA() {
		return a;
	}

	public void setA(appointment a) {
		this.a = a;
	}

	public String getD_PhoneNum() {
		return d_PhoneNum;
	}

	public void setD_PhoneNum(String d_PhoneNum) {
		this.d_PhoneNum = d_PhoneNum;
	}
	public String getD_Name() {
		return d_Name;
	}
	public void setD_Name(String d_Name) {
		this.d_Name = d_Name;
	}
	public String getD_Password() {
		return d_Password;
	}
	public void setD_Password(String d_Password) {
		this.d_Password = d_Password;
	}
	public String getD_Email() {
		return d_Email;
	}
	public void setD_Email(String d_Email) {
		this.d_Email = d_Email;
	}
	public String getD_Department() {
		return d_Department;
	}
	public void setD_Department(String d_Department) {
		this.d_Department = d_Department;
	}
	public int getD_Id() {
		return d_Id;
	}
	public void setD_Id(int d_Id) {
		this.d_Id = d_Id;
	}
	public void show() {
		for(int i =0; i < doctors_Record.size(); i++) {
			Doctor d = doctors_Record.get(i);
			System.out.println(d.d_Name);
			System.out.println(d.d_Department);
			System.out.println(d.d_Email);
			System.out.println(d.d_Id);
			System.out.println(d.d_Password);
			System.out.println(d.d_PhoneNum);
			System.out.println(d.available_hours);
			System.out.println(d.working_days);
		}
	}
}
