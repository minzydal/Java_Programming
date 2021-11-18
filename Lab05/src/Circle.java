
public class Circle implements GeometricInterface{
	private double radious;
	public double getPerimeter() {return 2*Math.PI*radious;}
	public double getArea() {return Math.PI*radious*radious;}

	
	public Circle(double radious) {
		this.radious = radious;
	}
	
	public Circle(){
		this.radious = 1.0;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

	@Override
	public String toString() {
		return "Circle [radious=" + radious + "]";
	}
	
	
}
