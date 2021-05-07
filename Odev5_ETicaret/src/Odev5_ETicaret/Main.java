package Odev5_ETicaret;

import Odev5_ETicaret.business.concrete.CustomerManager;
import Odev5_ETicaret.business.utils.AcceptVerification;
import Odev5_ETicaret.business.validations.concrete.EmailValidations;
import Odev5_ETicaret.business.validations.concrete.ValidationManager;
import Odev5_ETicaret.business.validations.concrete.CustomerValidations;
import Odev5_ETicaret.dataAccess.concrete.HibernetCustomerDao;
import Odev5_ETicaret.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		String response1;
		String response2;
		String login;
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Mübin");
		customer.setSurName("Güneþ");
		customer.seteMail("aaaa@aa.com");
		customer.setPassword("1111111");
		
		Customer customer2 = new Customer();
		customer2.setId(1);
		customer2.setName("Mübin");
		customer2.setSurName("Güneþ");
		customer2.seteMail("aaaa@aa.com");
		customer2.setPassword("1111111");
		
		CustomerManager customerManager=new CustomerManager(new HibernetCustomerDao(),new ValidationManager(new EmailValidations(),new CustomerValidations()));
		response1=customerManager.add(customer);
		System.out.println(response1);
		response2=customerManager.add(customer2);
		System.out.println(response2);
		
		AcceptVerification.AcceptMail();
		
		login=customerManager.login("aaaa@aa.com","1111111");
		System.out.println(login);
	}

}
