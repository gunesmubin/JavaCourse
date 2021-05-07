package Odev5_ETicaret.business.validations.concrete;


import Odev5_ETicaret.business.validations.abstracts.CustomerValidation;
import Odev5_ETicaret.business.validations.abstracts.MailValidation;
import Odev5_ETicaret.entities.concretes.Customer;

public class ValidationManager implements CustomerValidation,MailValidation {

	private MailValidation mailValidation;
	private CustomerValidation customerValidation;
	
	
	public ValidationManager(MailValidation mailValidation, CustomerValidation customerValidation) {
		this.mailValidation = mailValidation;
		this.customerValidation = customerValidation;
	}

	@Override
	public boolean customerIsValid(Customer customer) {
		boolean response;
		response=customerValidation.customerIsValid(customer);
		return response;
	}

	@Override
	public boolean checkEMail(String eMail) {
		boolean response;
		response=mailValidation.checkEMail(eMail);
		return response;
	}

}
