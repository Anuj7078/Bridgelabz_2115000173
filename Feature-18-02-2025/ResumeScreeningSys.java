import java.util.*;
class ResumeScreeningSys{
	public static void main(String[]args){
		Resume<SoftwareEngineer> se = new Resume<>();
        se.add(new SoftwareEngineer("Kunal"));
        se.add(new SoftwareEngineer("Anuj"));

        Resume<DataScientist> ds = new Resume<>();
        ds.add(new DataScientist("Chirag"));
        ds.add(new DataScientist("Love"));

        Resume<ProductManager> pm = new Resume<>();
        pm.add(new ProductManager("Ankit"));
        pm.add(new ProductManager("Bhagoaday"));

        System.out.println("Software Engineer Resumes:");
        Resume.displayResume(se.getResumeList());

        System.out.println("Data Scientist Resumes:");
        Resume.displayResume(ds.getResumeList());

        System.out.println("Product Manager Resumes:");
        Resume.displayResume(pm.getResumeList());
	}
}
abstract class JobRole{
	private String candidateName;
	JobRole(String candidateName){
		this.candidateName = candidateName;
	}
	
	public String getCandidateName(){
		return candidateName;
	}
}
class SoftwareEngineer extends JobRole{
	SoftwareEngineer(String candidateName){
		super(candidateName);
	}
}
class DataScientist extends JobRole{
	DataScientist(String candidateName){
		super(candidateName);
	}
}
class ProductManager extends JobRole{
	ProductManager(String candidateName){
		super(candidateName);
	}
}
class Resume<T extends JobRole>{
	private List<T> resumeList = new ArrayList<>();
	void add(T resume){
		resumeList.add(resume);
	}
	List<T> getResumeList(){
		return resumeList;
	}
	public static void displayResume(List<? extends JobRole> resumelist){
		for(JobRole jr : resumelist)
			System.out.println("Candidate Name: "+jr.getCandidateName());
	}
}