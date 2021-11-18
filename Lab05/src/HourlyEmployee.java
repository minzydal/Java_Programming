
public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	
	public HourlyEmployee(String fName, String lName, String sSN,double wage, double hours) {
		super(fName, lName, sSN);
		this.wage = wage;
		this.hours = hours;
	}
	
	public HourlyEmployee(double wage, double hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}
	
	public HourlyEmployee() {
		super();
		this.wage = 0.0;
		this.hours = 0.0;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public double earnings() {
		double earn=0.0;
		if(this.hours<=40)
			earn = wage * hours;
		else if (hours > 40)
			earn =  40 * wage + (hours - 40) * wage * 1.5;
		return earn;
	}
	@Override
	public String toString() {
		return "HourlyEmployee => hours : " + hours +"wage : " + wage +"]\t\t" + super.toString();
	}
}
