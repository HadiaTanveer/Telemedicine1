package application;

public class doctorAppRegister {

	private String app__time;
	private String app_date;
	private String appointmentDr;
	
	public String getAppointmentDr() {
		return appointmentDr;
	}
	public void setAppointmentDr(String appointmentDr) {
		this.appointmentDr = appointmentDr;
	}
	public String getApp__time() {
		return app__time;
	}
	public void setApp__time(String app__time) {
		this.app__time = app__time;
	}
	public String getApp_date() {
		return app_date;
	}
	public void setApp_date(String app_date) {
		this.app_date = app_date;
	}
	
	public doctorAppRegister(String appointmentDr, String app__time, String app_date) {
		super();
		this.appointmentDr = appointmentDr;
		this.app__time = app__time;
		this.app_date = app_date;
	}
	
	
}
