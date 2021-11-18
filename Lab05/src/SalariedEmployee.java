
public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public SalariedEmployee() {
		super();
		weeklySalary=0.0;
	}
	
	public SalariedEmployee(String fName, String lName, String sSN,double ws){
		super(fName, lName, sSN);
		weeklySalary=ws;
	}

	@Override
	public String toString() {
		return "SalariedEmployee => weeklySalary : " + weeklySalary + "]\t\t" + super.toString();
	}
	
	@Override
	public double earnings() {
		return weeklySalary;
	}
	
	
}
