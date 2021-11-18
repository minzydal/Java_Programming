
public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radious) {
		super(radious);
	}
	public void resize(double p) {
		setRadious(getRadious()*p);
	}
	
}
