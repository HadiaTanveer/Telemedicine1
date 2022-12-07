package application;

public class e_prescriptionSystem {
	
	private String Prescription;
	private String medicines;
	private String dr_prescribing;
	private String consultation_Date;
	private String history;
	private String patientName;
	private int e_prescription_id;

	public String getPrescription() {
		return Prescription;
	}
	public void setPrescription(String prescription) {
		Prescription = prescription;
	}
	public String getMedicines() {
		return medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	public String getDr_prescribing() {
		return dr_prescribing;
	}
	public void setDr_prescribing(String dr_prescribing) {
		this.dr_prescribing = dr_prescribing;
	}
	public String getConsultation_Date() {
		return consultation_Date;
	}
	public void setConsultation_Date(String consultation_Date) {
		this.consultation_Date = consultation_Date;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getE_prescription_id() {
		return e_prescription_id;
	}
	public void setE_prescription_id(int e_prescription_id) {
		this.e_prescription_id = e_prescription_id;
	}
	
	public e_prescriptionSystem(String prescription, String medicines, String dr_prescribing, String consultation_Date,
			String history, String patientName, int e_prescription_id) {
		super();
		this.Prescription = prescription;
		this.medicines = medicines;
		this.dr_prescribing = dr_prescribing;
		this.consultation_Date = consultation_Date;
		this.history = history;
		this.patientName = patientName;
		this.e_prescription_id = e_prescription_id;
	}
	
	
}
