package lab07;

import javafx.beans.property.SimpleStringProperty;

public class Person {
	private SimpleStringProperty firstName;
	private SimpleStringProperty lastName;
	private SimpleStringProperty email;
	
	Person(String fName, String lName, String email){
		this.firstName = new SimpleStringProperty(fName);
		this.lastName = new SimpleStringProperty(lName);
		this.email = new SimpleStringProperty(email);
	}

	public SimpleStringProperty getFirstName() {
		return firstName;
	}

	public void setFirstName(SimpleStringProperty firstName) {
		this.firstName = firstName;
	}

	public SimpleStringProperty getLastName() {
		return lastName;
	}

	public void setLastName(SimpleStringProperty lastName) {
		this.lastName = lastName;
	}

	public SimpleStringProperty getEmail() {
		return email;
	}

	public void setEmail(SimpleStringProperty email) {
		this.email = email;
	}
	
	public String toString() {
		return "{" + getFirstName() +", "+ getLastName() + ", " + getEmail()+"}";
	}
}
