
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String fName, String lName, String sSN, double grossSales, double cRate,double baseSalary) {
		super(fName, lName, sSN, grossSales, cRate);
		this.baseSalary = baseSalary;
	}
	
	public BasePlusCommissionEmployee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		return baseSalary + super.earnings(); 
	}
	@Override
	public String toString() {
		return "BasePlusCommissionEmployee =>BaseSalary : " + baseSalary + "]\t\t" + super.toString();
	}

}
