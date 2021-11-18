
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commisionRate;
	
	//constructor
	public CommissionEmployee(String fName, String lName, String sSN,double grossSales, double commisionRate) {
		super(fName, lName, sSN);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}
	
	public CommissionEmployee(double grossSales, double commisionRate) {
		super();
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}
	public CommissionEmployee() {
		super();
		this.grossSales = 0.0;
		this.commisionRate = 0.0;
	}
	
	//getters and setters
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	
	@Override
	public String toString() {
		return "CommissionEmployee => CommisionRate : " + commisionRate +"grossSales : "+grossSales+ "]\t\t" + super.toString();
	}
	
	@Override
	public double earnings() {
		return commisionRate*grossSales;
	}
	
}
