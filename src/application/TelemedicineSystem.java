package application;

public class TelemedicineSystem {

	static int id = 0;
	int patient_id = 1;
	int doctor_id = 1;
	int j=0;
	/*public int registerPatients(String name, String password, String email, int age) {
		
		Patient p = new Patient(name, password, age, patient_id, email);
		p.patients_Record.add(p);
		patient_id++;
		for(int i =0; i < p.patients_Record.size(); i++) {
			if(name.equals(p.getpName())) {
				this.j = i;
				id = i;
				return i;
			}
		}
		return j;
	}*/
	
	public int getIndex(String name, String Password) {
		Patient p = new Patient();
		for(int i =0; i < p.patients_Record.size(); i++) {
			if(name.equals(p.getpName())) {
				return i;
			}
	}
		return j;
	}
	
	public boolean validatePatients(String name, String password) {
		boolean valid = true;
		Patient p = new Patient();
		for(int i = 0; i<p.patients_Record.size(); i++) {
			p = p.patients_Record.get(i);
			if(p.getpName().equals(name)) {
				if(p.getpPassword().equals(password)) {
					id = i;
					valid = true;
				}
				else {
					valid = false;
				}
			}
			else {
			      valid = false;
			}
		}
		return valid;
	}
	
	/*public void registerDoctors(String name, String password, String email, String department) {
		Doctor d = new Doctor(name, password, email, department, doctor_id);
		d.doctors_Record.add(d);
		doctor_id++;
	}*/
	
	Doctor d = new Doctor();
	static int d_id = 1;
	public void addDoctorRecord() {
		d = new Doctor("Dr. Brenner", "brenner", "brenner12@gmail.com", "paediatrics", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Monday,Wednesday,Friday,Sunday");
		d.addDoctorsRecord(d);
		d = new Doctor("Dr. Owen", "owen", "owen12@gmail.com", "Otorhinolaryngology", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Tuesday,Thursday,Saturday,Sunday");
		d.addDoctorsRecord(d);
		d = new Doctor("Dr. Smith", "smith", "jamesmith12@gmail.com", "Cardiology", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Monday,Tuesday,Wednesday,Thursday,Friday");
		d.addDoctorsRecord(d);
		d = new Doctor("Dr. Henderson", "henderson", "dustinhenderson12@gmail.com", "Nephrology", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Monday,Wednesday,Friday,Sunday");
		d.addDoctorsRecord(d);
		d = new Doctor("Dr. Wheeler", "wheeler", "mikewheeler12@gmail.com", "paediatrics", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Monday,Wednesday,Friday,Sunday");
		d.addDoctorsRecord(d);
		d = new Doctor("Dr. Byers", "byers", "jonathonbyer12@gmail.com", "Otorhinolaryngology", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Monday,Wednesday,Friday,Sunday");
		d.addDoctorsRecord(d);
		d = new Doctor("Dr Hopper", "hopper", "hopper11@gmail.com", "Cardiology", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Monday,Wednesday,Friday,Sunday");
		d.addDoctorsRecord(d);
		d = new Doctor("Dr. Noah", "noah", "noahschnapp@gmail.com", "Nephrology", d_id++, 
				"100-210-234-2", "8,9,10,11,12,13,14,15,16,17,18", "Monday,Wednesday,Friday,Sunday");
		d.addDoctorsRecord(d);
	}
	
	public void validateDoctors() {
		
	}
}
