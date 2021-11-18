package Collections;

public class test {
	private int a;
	private int b;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	public boolean equals(test obj) {
		return (this.a > obj.a);
	}
}
