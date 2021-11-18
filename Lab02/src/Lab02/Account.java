package Lab02;
public class Account {
	private String id;
	private String name;
	private int balance;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public int credit(int amount) {
		setBalance(getBalance() + amount);
		return this.balance;
	}
	
	public int debit(int amount) {
		if(this.balance >= amount) {
			setBalance(getBalance() - amount);
		}
			else
				System.out.println("Amount exceeded balance");
			return this.balance;
	}
	
	
	public int transferTo(Account a, int amount) {
		if(this.balance >= amount) {
			setBalance(getBalance() - amount);
			a.setBalance(a.getBalance() + amount);
		}
		else
			System.out.println("Amount exceeded balance");
		return this.balance;
	}
}
