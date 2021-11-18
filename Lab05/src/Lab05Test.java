
public class Lab05Test {

	public static void main(String[] args) {
		Payable[] po = new Payable[4];
		po[0] = new invoice("1111", "Tiers", 7, 200.0);
		// po[1] = new Employee(); Employee is abstract class
		po[1] = new SalariedEmployee("Jahoon", "Lee","1234-5678", 100000.0);
		po[2] = new invoice("1111","seats",27,100.0);
		po[3] = new HourlyEmployee("Minzy", "Kim","9876-5432", 15000.0, 1);
		
		for(Payable p:po) {
			System.out.println(p.earnings());
		}
	}
	
	public static void testGI() {
		GeometricInterface[] gi = new GeometricInterface[3];
		gi[0] = new Circle(3);
		gi[1] = new ResizableCircle(4);
		ResizableCircle c1 = new ResizableCircle(5);
		c1.resize(5);
		gi[2] = c1;
		for(GeometricInterface c:gi) {
			System.out.println(((Circle)c).getRadious());
			System.out.println(c.getPerimeter());
			System.out.println(c.getArea());
		}
	}

}
