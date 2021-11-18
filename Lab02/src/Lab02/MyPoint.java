package Lab02;
public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {this.x = 0; this.y = 0;}	//overloading function
	public MyPoint(int x) {this.x = x; this.y = 0;}
	public MyPoint(int x, int y) {this.x = x; this.y = y;}
	public MyPoint(MyPoint p) {
		this.x = p.x;
		this.y = p.y;
		
		setX(p.getX());
		setY(p.getY());
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) 
	{
		this.x=x; 
		this.y=y;
	}
	
	public double distance(int x, int y) {
		return Math.sqrt((this.x-x) * (this.x-x) + (this.y-y) * (this.y-y));
	}
	
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	public double distance(MyPoint p) {
		return Math.sqrt((this.x-p.x) * (this.x-p.x) + (this.y-p.y) * (this.y-p.y));
	
	}
	
	public String toString() {
		
		return "(" + this.x + "," + this.y + ")";
		
		//return String.format(format, args)	// same as printf
	}
}
