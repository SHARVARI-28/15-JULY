
public class Patient {

	String patientName;
	double height,weight;
	Patient(String name,double height, double weight)
	{
		this.patientName = name;
		this.height = height;
		this.weight = weight;
	}
	double computeBMI()
	{
		return(weight / (height*height)) ;
	}
	public static void main(String[] args) {
		Patient patient = new Patient ("HARRY", 163.4, 75);
		System.out.println("Name: "+patient.patientName +"\nHeight: " +patient.height + "\nWeight: " +patient.weight );
		System.out.println("BMI of the patient is: "+patient.computeBMI());
	}

}
