
public class Term {
	private double coeff;
	private int exp;
	
	public Term(double coeff, int exp) {
		this.coeff = coeff;
		this.exp = exp;
	}
	public double getCoeff() {
		return coeff;
	}
	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return coeff + "x^" + exp;
	}
	
}
