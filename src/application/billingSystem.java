package application;

public class billingSystem {
	
	private int bill_id;
	private double bill;
	private String date_issued;
	private String date_due;
	private int patient_id;
	
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public String getDate_issued() {
		return date_issued;
	}
	public void setDate_issued(String date_issued) {
		this.date_issued = date_issued;
	}
	public String getDate_due() {
		return date_due;
	}
	public void setDate_due(String date_due) {
		this.date_due = date_due;
	}

	public billingSystem(int patient_id, int bill_id, double bill, String date_issued, String date_due) {
		super();
		this.patient_id = patient_id;
		this.bill_id = bill_id;
		this.bill = bill;
		this.date_issued = date_issued;
		this.date_due = date_due;
	}
	
}
