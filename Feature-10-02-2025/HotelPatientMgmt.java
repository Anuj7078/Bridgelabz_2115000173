import java.util.*;
class HospitalPatientMgmt{
	public static void main(String[]args){
		Patient inPatient = new InPatient("Anuj",1, 21, 15, 2000);
        Patient outPatient = new OutPatient("Kunal",50476, 13);
        inPatient.addRecord("Typhoid");
        outPatient.addRecord("CheckUp");
        inPatient.getPatientDetails();
        System.out.println("Bill: " + inPatient.calculateBill()+" Rs.");
        System.out.println("Medical Records: " + inPatient.viewRecords());
        System.out.println("*********************************");
        outPatient.getPatientDetails();
        System.out.println("Bill: " + outPatient.calculateBill()+" Rs.");
        System.out.println("Medical Records: " + outPatient.viewRecords());
	}
}
abstract class Patient{
    private String name;
    private int patientId, age;
	private List<String> Records = new ArrayList<>();
    Patient(String name,int patientId,int age){
        this.name = name;
        this.patientId = patientId;
        this.age = age;
    }
    abstract double calculateBill();
    public void getPatientDetails(){
        System.out.println("Patient Name: "+name);
        System.out.println("Patient Id: "+patientId);
        System.out.println("Patient Age: "+age);
    }
    public int getPatientId(){
        return patientId;
    }
	public void addRecord(String record) {
        Records.add(record);
    }

    public List<String> viewRecords() {
        return new ArrayList<>(Records);
    }
}
class InPatient extends Patient implements MedicalRecord{
	private int totalDays, perDayRate;
	InPatient(String name,int patientId,int age, int totalDays, int perDayRate){
		super(name,patientId,age);
		this.totalDays = totalDays;
		this.perDayRate = perDayRate;
	}
	public double calculateBill() {
        return totalDays * perDayRate;
    }
}
class OutPatient extends Patient implements MedicalRecord{
	private int consultantFee = 2000;
    OutPatient(String name, int price, int quantity) {
        super(name, price, quantity);
    }
	public double calculateBill(){
		return consultantFee;
	}
}
interface MedicalRecord{
    void addRecord(String record);
    List<String> viewRecords();
}