package Odev5_ETicaret.entities.concretes;

public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;
	
	public IndividualCustomer() {}

	public IndividualCustomer(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
