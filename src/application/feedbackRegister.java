package application;

public class feedbackRegister {
	
	private String patient_name;
	private int patient_id;
	private String feedback;
	
	public feedbackRegister(String patient_name, int patient_id, String feedback) {
		super();
		this.patient_name = patient_name;
		this.patient_id = patient_id;
		this.feedback = feedback;
	}

	
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}
