package application;

public class appointment {
	
	private int appDrID;
	private String appTime;
	private int appPatientID;
	
	public int getAppDrID() {
		return appDrID;
	}
	public void setAppDrID(int appDrID) {
		this.appDrID = appDrID;
	}
	public String getAppTime() {
		return appTime;
	}
	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}
	public int getAppPatientID() {
		return appPatientID;
	}
	public void setAppPatientID(int appPatientID) {
		this.appPatientID = appPatientID;
	}
	
	public appointment(int appDrID, String appTime, int appPatientID) {
		super();
		this.appDrID = appDrID;
		this.appTime = appTime;
		this.appPatientID = appPatientID;
	}
	
	public appointment() {
		this.appDrID = 0;
		this.appTime = " ";
		this.appPatientID = 0;
	}
	
	
}
