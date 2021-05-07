package Odev5_ETicaret.business.validations.concrete;

import Odev5_ETicaret.business.validations.abstracts.CustomerValidation;
import Odev5_ETicaret.entities.concretes.Customer;

public class CustomerValidations implements CustomerValidation {

	public boolean customerIsValid(Customer customer)
	{
		if (customer==null || customer.geteMail()==""||customer.getPassword()=="" ||customer.getName()==""||customer.getSurName()=="") {
			return false;
		}
		else if(customer.getPassword().length()<6) {
			return false;
		}
		else if(customer.getName().length()<2||customer.getSurName().length()<2) {
			return false;
		}
		return true;
	}

}
