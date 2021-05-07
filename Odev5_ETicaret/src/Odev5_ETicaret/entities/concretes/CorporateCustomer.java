package Odev5_ETicaret.entities.concretes;

public class CorporateCustomer extends Customer {

	private String companyNumber;
	private String taxNumber;
	
	public CorporateCustomer() {}

	public CorporateCustomer(String companyNumber, String taxNumber) {
		this.companyNumber = companyNumber;
		this.taxNumber = taxNumber;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
