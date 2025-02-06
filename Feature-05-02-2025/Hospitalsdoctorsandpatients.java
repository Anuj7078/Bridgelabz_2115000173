import java.util.*;
class Hospitalsdoctorsandpatients{
	public static void main(String[]args){
		Hospital hospital = new Hospital("Swarn jayanti");
		
		Doctor doctor1 = new Doctor("Dr. Chitra");
		Doctor doctor2 = new Doctor("Dr. Anju");
		
		Patient patient1 = new Patient("Ayush");
		Patient patient2 = new Patient("amol");
		Patient patient3 = new Patient("Kunal");
		
		hospital.addDoctor(doctor1);
		hospital.addDoctor(doctor2);
		
		hospital.addPatient(patient1);
		hospital.addPatient(patient2);
		hospital.addPatient(patient3);
		
		doctor1.consult(patient1);
		doctor1.consult(patient2);
		doctor1.consult(patient3);
		
		doctor2.consult(patient2);
		doctor2.consult(patient3);
		
		doctor1.viewPatients();
		doctor2.viewPatients();
		
		patient1.viewDoctors();
		patient2.viewDoctors();
		patient3.viewDoctors();
	}
}
class Hospital{
	private String hospitalName;
	private List<Doctor> doctors;
	private List<Patient> patients;
	
	Hospital(String hospitalName){
		this.hospitalName = hospitalName;
		this.doctors = new ArrayList<>();
		this.patients = new ArrayList<>();
	}
	public void addDoctor(Doctor doctor){
		doctors.add(doctor);
	}
	public void addPatient(Patient patient){
		patients.add(patient);
	}
	public String getHospitalName(){
		return hospitalName;
	}
}
class Doctor{
	private String doctorName;
	private List<Patient> patients;
	Doctor(String doctorName){
		this.doctorName = doctorName;
		this.patients = new ArrayList<>();
	}
	public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }
	public void viewPatients(){
		System.out.println("Patients Under "+doctorName+" are:");
		for(Patient patient : patients)
			System.out.println(patient.getPatientName());
	}
	public String getDoctorName(){
		return doctorName;
	}
}
class Patient{
	private String patientName;
	private List<Doctor> doctors;
	Patient(String patientName){
		this.patientName = patientName;
		this.doctors = new ArrayList<>();
	}
	public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor))
            doctors.add(doctor);
    }
	public void viewDoctors(){
		System.out.println("Patients "+patientName+" consult from:");
		for(Doctor doctor : doctors)
			System.out.println(doctor.getDoctorName());
	}
	public String getPatientName(){
		return patientName;
	}
}