
public class invoice implements Payable{
	private String pNumber;
	private String pDesc;
	private int quantity;
	private double price;
	
	public double earnings() {
		return quantity*price;
	}
	
	public invoice(String pNumber, String pDesc, int quantity, double price) {
		super();
		this.pNumber = pNumber;
		this.pDesc = pDesc;
		this.quantity = quantity;
		this.price = price;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "invoice [pNumber=" + pNumber + ", pDesc=" + pDesc + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
