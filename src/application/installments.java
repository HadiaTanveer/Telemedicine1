package application;

public class installments {
	
	private int patient_id;
	private int bill_id;
	private int installment_num;
	private boolean installment_approval;
	
	
	public installments(int patient_id, int bill_id, int installment_num, boolean installment_approval) {
		super();
		this.patient_id = patient_id;
		this.bill_id = bill_id;
		this.installment_num = installment_num;
		this.installment_approval = installment_approval;
	}
	
	
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
	public int getInstallment_num() {
		return installment_num;
	}
	public void setInstallment_num(int installment_num) {
		this.installment_num = installment_num;
	}
	public boolean isInstallment_approval() {
		return installment_approval;
	}
	public void setInstallment_approval(boolean installment_approval) {
		this.installment_approval = installment_approval;
	}
	
	
}
